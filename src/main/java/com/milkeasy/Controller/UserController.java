package com.milkeasy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.milkeasy.Dto.LoginDTO;
import com.milkeasy.Dto.UserDTO;
import com.milkeasy.Service.UserService;
import com.milkeasy.response.LoginResponse;


@Controller
@CrossOrigin
@RequestMapping("api/v1/user")//8088
public class UserController {
	@GetMapping("/home")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/view_login")
	public String viewLoginPage() {
		return "login";
	}
	
	@GetMapping("/view_login_pop")
	public String viewLoginPopPage(Model model) {
		UserDTO userDTO = new UserDTO();
		model.addAttribute("userDTO", userDTO);
		LoginDTO loginDTO = new LoginDTO();
		model.addAttribute("loginDTO", loginDTO);
		
		return "login_pop";
	}
	
	//Also called dependency injection or bean injection
	@Autowired //automatically creates object address and inject it to variable. spring IOC
	private UserService userService;
	
	
	@PostMapping(path = "/save")
	public String saveUser(@ModelAttribute("userDTO") UserDTO userDTO){
		
		String id = userService.addUser(userDTO);
		return "redirect:/api/v1/user/home";
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<?> loginUser(@ModelAttribute("loginDTO") LoginDTO loginDTO){
		
		LoginResponse loginResponse = userService.loginUser(loginDTO);
		return ResponseEntity.ok(loginResponse);
	}
}
