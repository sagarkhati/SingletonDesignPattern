package com.sk;

public class Logger {

	private static Logger logger = new Logger();

	private Logger() {
		System.out.println("Creating Logger Object... ");
	}

	public static Logger getLogger() {
		return logger;
	}

}
