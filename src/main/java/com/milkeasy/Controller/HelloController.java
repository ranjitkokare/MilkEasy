package com.milkeasy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@CrossOrigin
@RequestMapping("api/v1/testing")//8088
public class HelloController {
	
	@GetMapping("/")
	public String ranjitFirstMethod() {
		return "ranjit_index";
	}
}
