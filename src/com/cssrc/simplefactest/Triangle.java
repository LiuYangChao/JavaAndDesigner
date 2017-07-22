package com.cssrc.simplefactest;

public class Triangle implements Shape {

	@Override
	public void draw() {
		LogUtil.log("三角形绘制");
	}

	@Override
	public void erase() {
		LogUtil.log("三角形擦除");
	}

}