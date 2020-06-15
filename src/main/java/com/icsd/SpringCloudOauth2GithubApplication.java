package com.icsd;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso //to enable Oauth2
@RestController
public class SpringCloudOauth2GithubApplication {
	
	@GetMapping("/")
	public String message(Principal principal)
	{
		//Here Principal object is used to get the username
		return "Hi "+principal.getName()+" welcome to SpringCloudOauth2GithubApplication";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOauth2GithubApplication.class, args);
		System.out.println("server start");
	}

}
