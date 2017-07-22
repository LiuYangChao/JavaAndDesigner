package com.cssrc.simplefactest;

public class Square implements Shape {

	@Override
	public void draw() {
		LogUtil.log("方形绘制");
	}

	@Override
	public void erase() {
		LogUtil.log("方形擦除");
	}

}