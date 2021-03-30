package com.scloud.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalHostRouteConfig {

	@Bean
	public RouteLocator localHostRoute(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/api/v1/inventory/*", "/api/v1/inventory2/*")
						.uri("http://127.0.0.1:7070"))
				.route(r -> r.path("/api/v1/user/*", "/api/v1/user2/*")
						.uri("http://127.0.0.1:8080"))
				.build();
	}
}
