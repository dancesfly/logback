package com.test.logback;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class App {
	final static Logger logger = (Logger) LoggerFactory.getLogger("App.class");

	public static void main(String[] args) {
		logger.debug("trace");
	}
}
