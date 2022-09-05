package com.spring.mydiv.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mydiv.Dto.TravelDto;
import com.spring.mydiv.Service.TravelService;

import lombok.RequiredArgsConstructor;

/**
 * @author 12nov
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
//@RequestMapping("/")
public class TravelController {
	private final TravelService travelservice;
	
    @PostMapping("/create-travel")
    public ResponseEntity<TravelDto> createTravel(@RequestBody TravelDto request) {
    	return ResponseEntity.ok(travelservice.createTravel(request));
    }
}
