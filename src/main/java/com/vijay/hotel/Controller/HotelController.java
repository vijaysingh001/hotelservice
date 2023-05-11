package com.vijay.hotel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.hotel.entity.Hotel;
import com.vijay.hotel.hotelservice.Hotelservice;

@RestController
public class HotelController {

	@Autowired
	private Hotelservice hotelserviceimpl;
	
	@GetMapping("/hotel/{id}")
	public ResponseEntity<Hotel> getHotelByhotelId(@PathVariable int id) {
		
		Hotel hotelbyid=hotelserviceimpl.getHotelById(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(hotelbyid);
		
	}
	
	@PostMapping("/savehotel")
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
		System.out.println(hotel);
		Hotel savehoteldetails=hotelserviceimpl.createHotel(hotel);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(savehoteldetails);
	}
	
	
	
}
