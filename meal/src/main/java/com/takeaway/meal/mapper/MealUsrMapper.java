package com.takeaway.meal.mapper;

import com.takeaway.meal.model.MealUsr;
import org.springframework.stereotype.Component;

@Component
public interface MealUsrMapper {
    int deleteByPrimaryKey(Integer usrId);

    int insert(MealUsr record);

    int insertSelective(MealUsr record);

    MealUsr selectByPrimaryKey(Integer usrId);

    int updateByPrimaryKeySelective(MealUsr record);

    int updateByPrimaryKey(MealUsr record);
}