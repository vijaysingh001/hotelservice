package com.vijay.hotel.hotelservice.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.hotel.entity.Hotel;
import com.vijay.hotel.hotelservice.Hotelservice;
import com.vijay.hotel.repository.HotelRepository;

@Service
public class HotelServiceImpl implements Hotelservice {
	
	@Autowired
	private HotelRepository hotelrepo;

	@Override
	public Hotel createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelrepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelrepo.findAll();
	}

	@Override
	public Hotel getHotelById(int id) throws NullPointerException {
		// TODO Auto-generated method stub
		
		Hotel h=hotelrepo.findById(id).orElseThrow(()-> new NullPointerException());
		return h;
	}


}
