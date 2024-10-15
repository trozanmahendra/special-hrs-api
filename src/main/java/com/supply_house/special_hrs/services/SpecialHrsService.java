package com.supply_house.special_hrs.services;

import com.supply_house.special_hrs.entity.RegularHour;
import com.supply_house.special_hrs.entity.SpecialHour;

import java.util.List;

public interface SpecialHrsService {

    List<SpecialHour> getAll();
    SpecialHour create(SpecialHour specialHour);
    SpecialHour update(SpecialHour specialHour);
    void delete(Integer id);
}
