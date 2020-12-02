package com.takeaway.meal.service;

import com.takeaway.meal.model.MealDeliveryman;
import com.takeaway.meal.model.MealMerchant;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public interface IMerchantService {

    MealMerchant findMerchant(Integer sid);
    int addMerchant(MealMerchant mealMerchant);

}
