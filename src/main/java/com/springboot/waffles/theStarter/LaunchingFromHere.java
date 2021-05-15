package com.springboot.waffles.theStarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.waffles.NfrApplication;

@RestController
public class LaunchingFromHere {
	
	@GetMapping("/welcome")
	public String welcomeCall() {
		return "You're now in the homepage mate !!!!";
	}

}
