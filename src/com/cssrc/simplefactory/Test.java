package com.cssrc.simplefactory;

public class Test {
	
	public static void main(String[] args){
		try{
			FruitGardener gardener = new FruitGardener();
			gardener.factory("grape");
			gardener.factory("apple");
			gardener.factory("strawberry");
		}catch(BadFruitException e){
			e.printStackTrace();
		}
	}
	
}
