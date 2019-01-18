package com.bootcamp.falmeida.singleton;

public class MySingleton {
	
	
	private static final MySingleton instance = new MySingleton();
	
	public static MySingleton getInstance() {
		return instance;
	}
	
	private MySingleton() {} // No Access
	
	

}
