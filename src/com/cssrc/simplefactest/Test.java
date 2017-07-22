package com.cssrc.simplefactest;

public class Test {
	
	public static void main(String[] args){
		try{
			ArtTracer trancer = new ArtTracer();
			Shape shape = trancer.factory("circle");
			shape.draw();
			shape.erase();
//			trancer.factory("square");
//			trancer.factory("test");
		}catch(BadShapeException e){
			e.printStackTrace();
		}
	}
	
}
