package com.kh.semi.user.model.service;

import com.kh.semi.user.model.vo.Rider;
import com.kh.semi.user.model.vo.User;
import com.kh.semi.user.model.vo.Vehicle;

public interface UserService {
	
	int insertUser(User u);
	
	int insertRider(Rider r);

	int insertVehicle(Vehicle v);

}