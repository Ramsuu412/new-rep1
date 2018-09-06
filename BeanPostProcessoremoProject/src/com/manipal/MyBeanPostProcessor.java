package com.manipal;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("in postProcessAfterInitialization() method");	
		System.out.println(arg1);
		
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("in postProcessBeforeInitialization() method");	
		System.out.println(arg1);
		return arg0;
	}

}
