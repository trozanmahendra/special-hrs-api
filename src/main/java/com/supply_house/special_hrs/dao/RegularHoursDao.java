package com.supply_house.special_hrs.dao;

import com.supply_house.special_hrs.entity.RegularHour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface RegularHoursDao extends JpaRepository<RegularHour,Integer> {

    @Modifying
    @Transactional
    @Query("Delete from RegularHour where id = :id ")
    void delete(@Param("id")Integer id);
}
