package com.spring.pubsub.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class StudentConsumer {

	private static final Logger logger = LoggerFactory.getLogger(StudentConsumer.class);

	@JmsListener(destination = "pubsub-queue")
	public void consumeMessage(String message) {
		logger.info("Message received from activemq queue---" + message);
	}

}
