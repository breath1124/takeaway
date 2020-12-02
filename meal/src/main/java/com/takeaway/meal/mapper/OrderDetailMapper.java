package com.takeaway.meal.mapper;

import com.takeaway.meal.model.OrderDetail;
import org.springframework.stereotype.Component;

@Component
public interface OrderDetailMapper {
    int deleteByPrimaryKey(Integer orId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Integer orId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}