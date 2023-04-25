package com.sk;

public class LoggerDemo {

	public static void main(String[] args) {
		Logger logger1 = Logger.getLogger();
		Logger logger2 = Logger.getLogger();

		System.out.println("Hashcode of Object logger1: " + logger1.hashCode());
		System.out.println("Hashcode of Object logger2: " + logger2.hashCode());
	}

}
