package com.byd.personnel.controller;

import com.alibaba.fastjson.JSONObject;
import com.byd.personnel.CardChartService;
import com.byd.personnel.common.entity.CardChartEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author mfc
 * @version v1.0
 * @date 2022/10/21 4:55 下午
 **/
@RestController
public class CardChartController {

    @Autowired
    public CardChartService cardChartService;

    @GetMapping("/cardChart/query/{id}")
    public CardChartEntity queryById(@PathVariable(value = "id") Long id) {
        return cardChartService.queryById(id);
    }

    @PostMapping("/cardChart/save")
    public int insert(@RequestBody String content) {
        CardChartEntity questionBankVO = JSONObject.parseObject(content, CardChartEntity.class);
        return cardChartService.insertCardChart(questionBankVO);
    }
}
