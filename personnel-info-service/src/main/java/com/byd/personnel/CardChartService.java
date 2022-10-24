package com.byd.personnel;

import com.byd.personnel.common.entity.CardChartEntity;

/**
 * @author mfc
 * @version v1.0
 * @date 2022/10/21 9:51 下午
 **/
public interface CardChartService {

    CardChartEntity queryById(Long id);

    int insertCardChart(CardChartEntity record);
}
