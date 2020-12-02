package com.takeaway.meal.mapper;

import com.takeaway.meal.model.MealLimittimeDiscounts;
import org.springframework.stereotype.Component;

@Component
public interface MealLimittimeDiscountsMapper {
    int deleteByPrimaryKey(Integer promotionId);

    int insert(MealLimittimeDiscounts record);

    int insertSelective(MealLimittimeDiscounts record);

    MealLimittimeDiscounts selectByPrimaryKey(Integer promotionId);

    int updateByPrimaryKeySelective(MealLimittimeDiscounts record);

    int updateByPrimaryKey(MealLimittimeDiscounts record);
}