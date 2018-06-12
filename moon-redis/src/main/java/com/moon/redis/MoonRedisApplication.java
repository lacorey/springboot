package com.moon.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class MoonRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoonRedisApplication.class, args);
	}
}
