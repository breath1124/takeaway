package com.takeaway.meal.mapper;

import com.takeaway.meal.model.MealDiscounts;
import org.springframework.stereotype.Component;

@Component
public interface MealDiscountsMapper {
    int deleteByPrimaryKey(Integer discntId);

    int insert(MealDiscounts record);

    int insertSelective(MealDiscounts record);

    MealDiscounts selectByPrimaryKey(Integer discntId);

    int updateByPrimaryKeySelective(MealDiscounts record);

    int updateByPrimaryKey(MealDiscounts record);
}