package com.au2018.webservices.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	
	@WebMethod
	public String sayMessage(String name);

}
