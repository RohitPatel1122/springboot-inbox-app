package com.rohitCodes.inboxApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(InboxApplication.class, args);
	}

	@GetMapping("/user")
	public String user(@AuthenticationPrincipal OAuth2User principal){
		System.out.println(principal);
		return principal.getAttribute("name");
	}
}
