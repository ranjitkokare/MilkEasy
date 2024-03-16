package com.milkeasy.Service.impl;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.milkeasy.Dto.LoginDTO;
import com.milkeasy.Dto.UserDTO;
import com.milkeasy.Entity.User;
import com.milkeasy.Repository.UserRepo;
import com.milkeasy.Service.UserService;
import com.milkeasy.response.LoginResponse;


@Service
public class UserIMPL implements UserService{

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addUser(UserDTO userDTO) {

		//passwordEncoder = new BCryptPasswordEncoder();
		User user = new User(
				
				userDTO.getUserId(),
				userDTO.getRole(),
				userDTO.getUserName(),
				userDTO.getMobile(),
				userDTO.getEmail(),
				userDTO.getAddress(),
				
				this.passwordEncoder.encode(userDTO.getPassword()),
				this.passwordEncoder.encode(userDTO.getConfirmpassword())
		);

		userRepo.save(user);

		return user.getUsername();
	}


	@Override
	public LoginResponse loginUser(LoginDTO loginDTO) {
		String msg = "";
		User user1 = userRepo.findByEmail(loginDTO.getEmail());
		if(user1 != null) {
			String password = loginDTO.getPassword();
			String encodedPassword = user1.getPassword();
			Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
			if(isPwdRight) {
				Optional<User> user = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(),encodedPassword);
				if(user.isPresent()) {
					return new LoginResponse("Login Success", true);
				}else {
					return new LoginResponse("Login Failed", false);
				}
			}else {
				return new LoginResponse("password Not Match", false);
			}
		}else {
			return new LoginResponse("Email not exists", false);
		}
	}
}






