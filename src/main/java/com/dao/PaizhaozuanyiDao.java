package com.dao;

import com.entity.PaizhaozuanyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.PaizhaozuanyiView;

/**
 * 牌照转移申请 Dao 接口
 *
 * @author 
 */
public interface PaizhaozuanyiDao extends BaseMapper<PaizhaozuanyiEntity> {

   List<PaizhaozuanyiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
