package com.user.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.user;   

@Service
public class UserServiceImpl implements UserService {
	
	List<user> list=List.of(
			new user(1210L,"Ehtasham","789988776"),
			new user(1211L,"Haque","5768787678"),
			new user(1212L,"Manal","987678887")

			);
		
		//1210L,name:"Ehtasham",phone:"678998776"));
	@Override
	public user getUser(Long id) {
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
		
	}

}
