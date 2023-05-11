package com.vijay.hotel.hotelservice;

import java.util.List;

import com.vijay.hotel.entity.Hotel;

public interface Hotelservice {

	
	public Hotel createHotel(Hotel hotel);

	public List<Hotel> getAllHotels();
	
	public Hotel getHotelById(int id);

	
}
