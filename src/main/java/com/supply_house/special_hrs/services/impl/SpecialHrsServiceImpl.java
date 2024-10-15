package com.supply_house.special_hrs.services.impl;

import com.supply_house.special_hrs.dao.SpecialHrsDao;
import com.supply_house.special_hrs.entity.RegularHour;
import com.supply_house.special_hrs.entity.SpecialHour;
import com.supply_house.special_hrs.services.SpecialHrsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialHrsServiceImpl implements SpecialHrsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpecialHrsServiceImpl.class);

    @Autowired
    private SpecialHrsDao specialHrsDao;

    @Override
    public List<SpecialHour> getAll() {
        return specialHrsDao.findAll();
    }

    @Override
    public SpecialHour create(SpecialHour specialHour) {
        return specialHrsDao.save(specialHour);
    }

    @Override
    public SpecialHour update(SpecialHour specialHour) {
        return specialHrsDao.save(specialHour);
    }

    @Override
    public void delete(Integer id) {
        specialHrsDao.delete(id);
    }
}
