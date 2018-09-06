package com.manipal;

public class B {
String str;

public B(String str) {
	super();
	this.str = str;
	System.out.println("constructing B's object!");
}

@Override
public String toString() {
	return "B [str=" + str + "]";
}


}
