
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 牌照换补申请
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/paizhaohuanbu")
public class PaizhaohuanbuController {
    private static final Logger logger = LoggerFactory.getLogger(PaizhaohuanbuController.class);

    @Autowired
    private PaizhaohuanbuService paizhaohuanbuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private CheliangService cheliangService;
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = paizhaohuanbuService.queryPage(params);

        //字典表数据转换
        List<PaizhaohuanbuView> list =(List<PaizhaohuanbuView>)page.getList();
        for(PaizhaohuanbuView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        PaizhaohuanbuEntity paizhaohuanbu = paizhaohuanbuService.selectById(id);
        if(paizhaohuanbu !=null){
            //entity转view
            PaizhaohuanbuView view = new PaizhaohuanbuView();
            BeanUtils.copyProperties( paizhaohuanbu , view );//把实体数据重构到view中

                //级联表
                CheliangEntity cheliang = cheliangService.selectById(paizhaohuanbu.getCheliangId());
                if(cheliang != null){
                    BeanUtils.copyProperties( cheliang , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setCheliangId(cheliang.getId());
                    view.setCheliangYonghuId(cheliang.getYonghuId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(paizhaohuanbu.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody PaizhaohuanbuEntity paizhaohuanbu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,paizhaohuanbu:{}",this.getClass().getName(),paizhaohuanbu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            paizhaohuanbu.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<PaizhaohuanbuEntity> queryWrapper = new EntityWrapper<PaizhaohuanbuEntity>()
            .eq("cheliang_id", paizhaohuanbu.getCheliangId())
            .eq("yonghu_id", paizhaohuanbu.getYonghuId())
            .eq("paizhaohuanbu_types", paizhaohuanbu.getPaizhaohuanbuTypes())
            .eq("paizhaohuanbu_paizhao", paizhaohuanbu.getPaizhaohuanbuPaizhao())
            .eq("paizhaohuanbu_yesno_types", paizhaohuanbu.getPaizhaohuanbuYesnoTypes())
            .eq("paizhaohuanbu_yesno_text", paizhaohuanbu.getPaizhaohuanbuYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        PaizhaohuanbuEntity paizhaohuanbuEntity = paizhaohuanbuService.selectOne(queryWrapper);
        if(paizhaohuanbuEntity==null){
            paizhaohuanbu.setPaizhaohuanbuYesnoTypes(1);
            paizhaohuanbu.setCreateTime(new Date());
            paizhaohuanbuService.insert(paizhaohuanbu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody PaizhaohuanbuEntity paizhaohuanbu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,paizhaohuanbu:{}",this.getClass().getName(),paizhaohuanbu.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            paizhaohuanbu.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<PaizhaohuanbuEntity> queryWrapper = new EntityWrapper<PaizhaohuanbuEntity>()
            .notIn("id",paizhaohuanbu.getId())
            .andNew()
            .eq("cheliang_id", paizhaohuanbu.getCheliangId())
            .eq("yonghu_id", paizhaohuanbu.getYonghuId())
            .eq("paizhaohuanbu_types", paizhaohuanbu.getPaizhaohuanbuTypes())
            .eq("paizhaohuanbu_paizhao", paizhaohuanbu.getPaizhaohuanbuPaizhao())
            .eq("paizhaohuanbu_yesno_types", paizhaohuanbu.getPaizhaohuanbuYesnoTypes())
            .eq("paizhaohuanbu_yesno_text", paizhaohuanbu.getPaizhaohuanbuYesnoText())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        PaizhaohuanbuEntity paizhaohuanbuEntity = paizhaohuanbuService.selectOne(queryWrapper);
        if(paizhaohuanbuEntity==null){
            if(paizhaohuanbu.getPaizhaohuanbuYesnoTypes() == 2){

                Wrapper<CheliangEntity> cheliang_paizhao = new EntityWrapper<CheliangEntity>()
                        .eq("cheliang_paizhao", paizhaohuanbu.getPaizhaohuanbuPaizhao());

                logger.info("sql语句:"+queryWrapper.getSqlSegment());
                CheliangEntity cheliangEntity1 = cheliangService.selectOne(cheliang_paizhao);
                if(cheliangEntity1==null) {
                    CheliangEntity cheliangEntity = new CheliangEntity();
                    cheliangEntity.setId(paizhaohuanbu.getCheliangId());
                    cheliangEntity.setCheliangPaizhao(paizhaohuanbu.getPaizhaohuanbuPaizhao());
                    cheliangService.updateById(cheliangEntity);
                }else{
                    return R.error(511,"该牌照已存在");
                }
            }
            paizhaohuanbuService.updateById(paizhaohuanbu);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        paizhaohuanbuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<PaizhaohuanbuEntity> paizhaohuanbuList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            PaizhaohuanbuEntity paizhaohuanbuEntity = new PaizhaohuanbuEntity();
//                            paizhaohuanbuEntity.setCheliangId(Integer.valueOf(data.get(0)));   //车辆 要改的
//                            paizhaohuanbuEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            paizhaohuanbuEntity.setPaizhaohuanbuTypes(Integer.valueOf(data.get(0)));   //申请类型 要改的
//                            paizhaohuanbuEntity.setPaizhaohuanbuPaizhao(data.get(0));                    //牌照 要改的
//                            paizhaohuanbuEntity.setPaizhaohuanbuYesnoTypes(Integer.valueOf(data.get(0)));   //申请状态 要改的
//                            paizhaohuanbuEntity.setPaizhaohuanbuYesnoText(data.get(0));                    //申请结果 要改的
//                            paizhaohuanbuEntity.setCreateTime(date);//时间
                            paizhaohuanbuList.add(paizhaohuanbuEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        paizhaohuanbuService.insertBatch(paizhaohuanbuList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
