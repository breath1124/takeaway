package com.takeaway.meal.mapper;

import com.takeaway.meal.model.MealOrder;
import org.springframework.stereotype.Component;

@Component
public interface MealOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(MealOrder record);

    int insertSelective(MealOrder record);

    MealOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(MealOrder record);

    int updateByPrimaryKey(MealOrder record);
}