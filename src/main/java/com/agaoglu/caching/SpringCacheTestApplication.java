package com.agaoglu.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
@EnableAutoConfiguration
public class SpringCacheTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCacheTestApplication.class, args);
	}

}
