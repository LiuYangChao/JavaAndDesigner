package com.cssrc.simplefactory;

public class Apple implements Fruit {

	//����
	private int treeAge;
	
	@Override
	public void grow() {
		
	}

	@Override
	public void harvest() {
		
	}

	@Override
	public void plant() {
		 log("ƻ����ֲ");
	}
	
	public void log(String msg){
		System.out.println(msg);
	}
	
}
