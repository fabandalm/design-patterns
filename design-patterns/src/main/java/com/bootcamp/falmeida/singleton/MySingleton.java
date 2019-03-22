package com.bootcamp.falmeida.singleton;

public class MySingleton {
	
	
	private static final MySingleton instance = new MySingleton();
	
	public static MySingleton getInstance() {
		return instance;
	}
	
	private MySingleton() {} 
	
	public int sum(int a,int b) {
		return a + b;
	}

}
