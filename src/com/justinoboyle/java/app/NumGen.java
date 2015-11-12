package com.justinoboyle.java.app;

public class NumGen {
	public NumGen(){}
	
	public int getRandomPosition(){
		int returnRan = (int)(Math.random()*4);
		return returnRan;
	}
}
