package com.byd.personnel.mapper;

import com.byd.personnel.common.entity.CardChartEntity;
import org.springframework.stereotype.Repository;


/**
 * @author mfc
 * @version v1.0
 * @date 2022/10/24 10:17 上午
 **/
@Repository
public interface CardChartMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CardChartEntity record);

    int insertSelective(CardChartEntity record);

    CardChartEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CardChartEntity record);

    int updateByPrimaryKey(CardChartEntity record);
}
