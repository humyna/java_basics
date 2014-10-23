package info.zoio.tec.java.basics.d141023.reflect.annotation.ws;

import javax.xml.ws.Endpoint;

public class HelloServicePublisher implements Runnable {
	public void run() {
		Endpoint.publish("http://localhost:8888/test/HelloService", new HelloServiceProvider());
	}

}
