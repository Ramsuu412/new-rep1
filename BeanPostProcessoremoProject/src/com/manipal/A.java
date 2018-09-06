package com.manipal;

public class A {

	int i;
	A()
	{
		System.out.println("constructing A's object!");
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	@Override
	public String toString() {
		return "A [i=" + i + "]";
	}
	
	
}
