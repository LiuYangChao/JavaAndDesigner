package com.cssrc.simplefactest;

public class Square implements Shape {

	@Override
	public void draw() {
		LogUtil.log("���λ���");
	}

	@Override
	public void erase() {
		LogUtil.log("���β���");
	}

}