package com.mgxz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller2 {
	private ThreadLocal<String> aa=new ThreadLocal<>();
	public Controller2() {
		System.err.println("Controller2!!!!!!!!!!!");
	}
	@RequestMapping(value="/b",method=RequestMethod.GET)
	public void fun(@RequestParam("ss")String ss){
		System.err.println(aa.get());
		System.err.println("123123123123123123");
		System.err.println(Thread.currentThread().getName());
		System.err.println(Thread.currentThread().hashCode());
		aa.set(System.currentTimeMillis()+"");
	}
}
