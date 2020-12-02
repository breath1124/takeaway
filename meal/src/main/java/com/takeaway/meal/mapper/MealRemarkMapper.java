package com.takeaway.meal.mapper;

import com.takeaway.meal.model.MealRemark;
import com.takeaway.meal.model.MealRemarkKey;
import org.springframework.stereotype.Component;

@Component
public interface MealRemarkMapper {
    int deleteByPrimaryKey(MealRemarkKey key);

    int insert(MealRemark record);

    int insertSelective(MealRemark record);

    MealRemark selectByPrimaryKey(MealRemarkKey key);

    int updateByPrimaryKeySelective(MealRemark record);

    int updateByPrimaryKeyWithBLOBs(MealRemark record);

    int updateByPrimaryKey(MealRemark record);
}