package com.milkeasy.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.milkeasy.Dto.LoginDTO;
import com.milkeasy.Dto.UserDTO;
import com.milkeasy.response.LoginResponse;

@Service
@Transactional
public interface UserService {
	
	String addUser(UserDTO userDTO);
	
	LoginResponse loginUser(LoginDTO loginDTO);
}
