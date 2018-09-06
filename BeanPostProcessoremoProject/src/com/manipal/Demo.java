package com.manipal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	A a=(A) ctx.getBean("aobj");
	System.out.println(a);
	B b=(B) ctx.getBean("bobj");
	System.out.println(b);
}
}
