package com.takeaway.meal.mapper;

import com.takeaway.meal.model.MealGoods;
import org.springframework.stereotype.Component;

@Component
public interface MealGoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(MealGoods record);

    int insertSelective(MealGoods record);

    MealGoods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(MealGoods record);

    int updateByPrimaryKey(MealGoods record);
}