package com.dao;

import com.entity.PaizhaoshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.PaizhaoshenqingView;

/**
 * 牌照申请 Dao 接口
 *
 * @author 
 */
public interface PaizhaoshenqingDao extends BaseMapper<PaizhaoshenqingEntity> {

   List<PaizhaoshenqingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
