package com.supply_house.special_hrs.utils;


import com.supply_house.special_hrs.entity.RegularHour;
import com.supply_house.special_hrs.entity.SpecialHour;

public class ApiResponse {
    private RegularHour regularHour;
    private SpecialHour specialHour;

    public RegularHour getRegularHour() {
        return regularHour;
    }

    public void setRegularHour(RegularHour regularHour) {
        this.regularHour = regularHour;
    }

    public SpecialHour getSpecialHour() {
        return specialHour;
    }

    public void setSpecialHour(SpecialHour specialHour) {
        this.specialHour = specialHour;
    }
}
