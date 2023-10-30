package com.yash.api.controller;

import com.yash.api.dto.DataResponse;
import com.yash.api.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FrontController {

    @Autowired
    private DataService dataService;

    @GetMapping("/zomato/{restaurant}/{item}/data")
    public ResponseEntity getZomatoData(@PathVariable String restaurant, @PathVariable String item) {

         DataResponse resp = dataService.getData("ZMTO", restaurant.toUpperCase(), item.toUpperCase());
         if(null != resp)
             return ResponseEntity.ok(resp);
         else
             return ResponseEntity.of(Optional.empty());
    }

    @GetMapping("/swiggi/{restaurant}/{item}/data")
    public ResponseEntity getSwiggiData(@PathVariable String restaurant, @PathVariable String item) {
        DataResponse resp = dataService.getData("SWGI", restaurant, item);
        if(null != resp)
            return ResponseEntity.ok(resp);
        else
            return ResponseEntity.of(Optional.empty());
    }
}
