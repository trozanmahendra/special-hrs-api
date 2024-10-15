package com.supply_house.special_hrs.controller;

import com.supply_house.special_hrs.entity.RegularHour;
import com.supply_house.special_hrs.entity.SpecialHour;
import com.supply_house.special_hrs.services.RegularHrsService;
import com.supply_house.special_hrs.services.SpecialHrsService;
import com.supply_house.special_hrs.utils.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/special-hrs")
public class HoursController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HoursController.class);

    @Autowired
    private RegularHrsService regularHrsService;
    @Autowired
    private SpecialHrsService specialHrsService;

//    end point for getting all hours json 
    @GetMapping("/allHrs")
    public ResponseEntity<ApiResponse> getAllHours(){
        LOGGER.info("Invoked getAllHours");
        ApiResponse apiResponse = new ApiResponse();
        RegularHour regularHour = regularHrsService.getAll().get(0); //considering only one record from db
        SpecialHour specialHour = specialHrsService.getAll().get(0); // same as above
        apiResponse.setRegularHour(regularHour);
        apiResponse.setSpecialHour(specialHour);
        return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> create(SpecialHour specialHour){
        LOGGER.info("Invoked Create for {}",specialHour);
        SpecialHour specialHr = specialHrsService.create(specialHour);
        return ResponseEntity.status(HttpStatus.OK).body(specialHr);
    }

    @PutMapping("/update")
    public ResponseEntity<Object> update(SpecialHour specialHour){
        LOGGER.info("Invoked Update for {}",specialHour);
        SpecialHour update = specialHrsService.update(specialHour);
        return ResponseEntity.status(HttpStatus.OK).body(update);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestParam(name = "id") Integer id){
        specialHrsService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("deleted record with id %d successfully.".formatted(id));
    }

}
