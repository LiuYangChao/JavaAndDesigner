package com.cssrc.simplefactest;

public class Circle implements Shape {

	@Override
	public void draw() {
		LogUtil.log("Բ�λ���");
	}

	@Override
	public void erase() {
		LogUtil.log("Բ�β���");
	}

}
