package com.formacionbdi.springboot.app.item;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	//We can use RestTemplate to test HTTP based restful web services
	@Bean("clienteRest")
	@LoadBalanced
	public RestTemplate registrarRestTemplate() { 
		return new RestTemplate();
	}

}
