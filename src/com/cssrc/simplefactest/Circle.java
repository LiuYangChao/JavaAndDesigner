package com.cssrc.simplefactest;

public class Circle implements Shape {

	@Override
	public void draw() {
		LogUtil.log("Ô²ÐÎ»æÖÆ");
	}

	@Override
	public void erase() {
		LogUtil.log("Ô²ÐÎ²Á³ý");
	}

}
