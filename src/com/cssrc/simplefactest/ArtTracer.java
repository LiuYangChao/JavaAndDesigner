package com.cssrc.simplefactest;

public class ArtTracer {
	
	public static Shape factory(String type) throws BadShapeException{
		if(type.equalsIgnoreCase("circle")){
			return new Circle();
		}else if(type.equalsIgnoreCase("square")){
			return new Square();
		}else if(type.equalsIgnoreCase("triangle")){
			return new Triangle();
		}else{
			throw new BadShapeException("ϵͳ��֧��ͼ��"+type+"����");
		}
	}
	
}
