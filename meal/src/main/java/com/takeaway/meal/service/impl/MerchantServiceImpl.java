package com.takeaway.meal.service.impl;

import com.takeaway.meal.mapper.MealMerchantMapper;
import com.takeaway.meal.model.MealMerchant;
import com.takeaway.meal.service.IMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MerchantServiceImpl implements IMerchantService {

    @Autowired
    MealMerchantMapper mealMerchantMapper;

    @Override
    public MealMerchant findMerchant(Integer sid) {
        return mealMerchantMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int addMerchant(MealMerchant mealMerchant) {
        return mealMerchantMapper.insert(mealMerchant);
    }
}
