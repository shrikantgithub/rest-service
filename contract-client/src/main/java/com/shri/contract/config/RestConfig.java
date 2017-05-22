package com.shri.contract.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

	@Bean
	public RestOperations createRestTemplate(final ClientHttpRequestFactory clientHttpRequestFactory){
		return new RestTemplate(clientHttpRequestFactory);
	}
	
	@Bean
	ClientHttpRequestFactory createClientHttpRequestFactory(@Value("${connection.timeout}") final int connectionTimeout,
			@Value("${read.timeout}") final int readTimeout){
		HttpComponentsClientHttpRequestFactory object = new HttpComponentsClientHttpRequestFactory();
		object.setReadTimeout(readTimeout);
		object.setConnectionRequestTimeout(connectionTimeout);
		return object;
	}
}
