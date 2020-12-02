package com.takeaway.meal.mapper;

import com.takeaway.meal.model.Ridework;
import com.takeaway.meal.model.RideworkKey;
import org.springframework.stereotype.Component;

@Component
public interface RideworkMapper {
    int deleteByPrimaryKey(RideworkKey key);

    int insert(Ridework record);

    int insertSelective(Ridework record);

    Ridework selectByPrimaryKey(RideworkKey key);

    int updateByPrimaryKeySelective(Ridework record);

    int updateByPrimaryKey(Ridework record);
}