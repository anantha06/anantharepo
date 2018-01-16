package com.au2018.webservices.soap;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
	 public static void main(String[] args) {
	  Endpoint.publish("http://localhost:8080/WS/HelloWorld",new HelloWorldImpl());
	 }

}
