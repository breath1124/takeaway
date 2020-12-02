package com.takeaway.meal.mapper;

import com.takeaway.meal.model.MealMerchant;
import org.springframework.stereotype.Component;

@Component
public interface MealMerchantMapper {
    int deleteByPrimaryKey(Integer merchantNum);

    int insert(MealMerchant record);

    int insertSelective(MealMerchant record);

    MealMerchant selectByPrimaryKey(Integer merchantNum);

    int updateByPrimaryKeySelective(MealMerchant record);

    int updateByPrimaryKey(MealMerchant record);
}