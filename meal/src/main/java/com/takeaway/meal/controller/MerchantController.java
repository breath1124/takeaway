package com.takeaway.meal.controller;

import com.takeaway.meal.model.MealDeliveryman;
import com.takeaway.meal.model.MealMerchant;
import com.takeaway.meal.service.IMerchantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "商家接口")
@RequestMapping("/merchant")
@RestController
public class MerchantController {

    @Autowired
    IMerchantService merchantService;

    @ApiOperation(value = "查询商家")
    @GetMapping("/query")
    public MealMerchant queryMerchant(Integer sid){
        MealMerchant mealMerchant = merchantService.findMerchant(sid);
        return mealMerchant;
    }

    @ApiOperation(value = "商家注册")
    @PutMapping("/insert")
    public int insertDeliveryman(MealMerchant mealMerchant){
        return merchantService.addMerchant(mealMerchant);
    }

}
