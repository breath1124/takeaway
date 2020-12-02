package com.takeaway.meal.mapper;

import com.takeaway.meal.model.MealDeliveryman;
import org.springframework.stereotype.Component;

@Component
public interface MealDeliverymanMapper {
    int deleteByPrimaryKey(Integer riderNum);

    int insert(MealDeliveryman record);

    int insertSelective(MealDeliveryman record);

    MealDeliveryman selectByPrimaryKey(Integer riderNum);

    int updateByPrimaryKeySelective(MealDeliveryman record);

    int updateByPrimaryKey(MealDeliveryman record);
}