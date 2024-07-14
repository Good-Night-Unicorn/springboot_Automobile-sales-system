package com.dao;

import com.entity.QicheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QicheView;

/**
 * 汽车 Dao 接口
 *
 * @author 
 */
public interface QicheDao extends BaseMapper<QicheEntity> {

   List<QicheView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
