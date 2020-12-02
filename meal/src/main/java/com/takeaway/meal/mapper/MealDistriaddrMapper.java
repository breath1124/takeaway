package com.takeaway.meal.mapper;

import com.takeaway.meal.model.MealDistriaddr;
import org.springframework.stereotype.Component;

@Component
public interface MealDistriaddrMapper {
    int deleteByPrimaryKey(Integer addrId);

    int insert(MealDistriaddr record);

    int insertSelective(MealDistriaddr record);

    MealDistriaddr selectByPrimaryKey(Integer addrId);

    int updateByPrimaryKeySelective(MealDistriaddr record);

    int updateByPrimaryKey(MealDistriaddr record);
}