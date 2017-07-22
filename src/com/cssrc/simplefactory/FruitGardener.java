package com.cssrc.simplefactory;

/**
 * ԰����
 * @author Liuyangchao
 *	2017��7��21�� ����11:28:29
 *	Email : js_liuyangchao@163.com
 */
public class FruitGardener {
	
	public static Fruit factory(String which) throws BadFruitException{
		if(which.equalsIgnoreCase("apple")){
			return new Apple();
		} else if(which.equalsIgnoreCase("strawberry")){
			return new Strawberry();
		} else if(which.equalsIgnoreCase("grape")){
			return new Grape();
		} else{
			throw new BadFruitException("Bad fruit request");
		}
	}
	
}
