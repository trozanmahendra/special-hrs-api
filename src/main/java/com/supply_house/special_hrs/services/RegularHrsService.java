package com.supply_house.special_hrs.services;

import com.supply_house.special_hrs.entity.RegularHour;

import java.util.List;

public interface RegularHrsService {
    List<RegularHour> getAll();
    RegularHour create(RegularHour regularHour);
    RegularHour update(RegularHour regularHour);
    void delete(Integer id);
}
