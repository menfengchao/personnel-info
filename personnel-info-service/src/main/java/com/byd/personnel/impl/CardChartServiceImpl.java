package com.byd.personnel.impl;

import com.byd.personnel.CardChartService;
import com.byd.personnel.common.entity.CardChartEntity;
import com.byd.personnel.mapper.CardChartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mfc
 * @version v1.0
 * @date 2022/10/21 9:52 下午
 **/
@Service
public class CardChartServiceImpl implements CardChartService {

    @Autowired
    public CardChartMapper cardChartMapper;

    @Override
    public CardChartEntity queryById(Long id) {
        return cardChartMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertCardChart(CardChartEntity record) {
        return cardChartMapper.insert(record);
    }
}
