package com.cssrc.simplefactest;

public class Triangle implements Shape {

	@Override
	public void draw() {
		LogUtil.log("�����λ���");
	}

	@Override
	public void erase() {
		LogUtil.log("�����β���");
	}

}