package com.supply_house.special_hrs.services.impl;

import com.supply_house.special_hrs.dao.RegularHoursDao;
import com.supply_house.special_hrs.entity.RegularHour;
import com.supply_house.special_hrs.services.RegularHrsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegularHrsServiceImpl implements RegularHrsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegularHrsServiceImpl.class);

    @Autowired
    private RegularHoursDao regularHoursDao;

    @Override
    public List<RegularHour> getAll() {
        return regularHoursDao.findAll();
    }

    @Override
    public RegularHour create(RegularHour regularHour) {
        return regularHoursDao.save(regularHour);
    }

    @Override
    public RegularHour update(RegularHour regularHour) {
        return regularHoursDao.save(regularHour);
    }

    @Override
    public void delete(Integer id) {
        regularHoursDao.delete(id);
    }
}
