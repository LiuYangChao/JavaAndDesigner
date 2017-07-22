package com.cssrc.simplefactory;

public class Apple implements Fruit {

	//Ê÷Áä
	private int treeAge;
	
	@Override
	public void grow() {
		
	}

	@Override
	public void harvest() {
		
	}

	@Override
	public void plant() {
		 log("Æ»¹ûÖÖÖ²");
	}
	
	public void log(String msg){
		System.out.println(msg);
	}
	
}
