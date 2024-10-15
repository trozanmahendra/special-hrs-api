package com.supply_house.special_hrs.dao;

import com.supply_house.special_hrs.entity.SpecialHour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SpecialHrsDao  extends JpaRepository<SpecialHour,Integer> {

    @Query("Delete from SpecialHour where id = :id")
    void delete(@Param("id")Integer id);
}
