package com.differentblock;


//the blocks are called explicitly are called different blocks in java
//Different Blocks 
//main, constructor, static, method, normal block

public class MainClass {

	static {
		System.out.println("static executes before main");
	}
	//normal block
	//normal block executes before constructor
	{
		System.out.println("normal block");
		System.out.println("normal block will executes on object creation before constructor");
	}
	MainClass(){
		System.out.println("Constructor block");
	}
	public static void main(String[] args) {
		System.out.println("MainBlock");
		MainClass ob=new MainClass();
	}

}
