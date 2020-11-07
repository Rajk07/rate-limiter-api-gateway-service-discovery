package com.rajkumar.apiigateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ApiiGatewayApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ApiiGatewayApplication.class)
					.run(args);
	}

}
