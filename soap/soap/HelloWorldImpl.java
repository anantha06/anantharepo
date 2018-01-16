package com.au2018.webservices.soap;

import javax.jws.WebService;

@WebService(endpointInterface="com.au2018.webservices.soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayMessage(String name) {
		return "Hi"+name+"Its me";
	}

}
