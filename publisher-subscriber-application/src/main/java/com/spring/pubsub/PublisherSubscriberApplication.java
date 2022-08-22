package com.spring.pubsub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring.pubsub.*")
public class PublisherSubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublisherSubscriberApplication.class, args);
	}

}
