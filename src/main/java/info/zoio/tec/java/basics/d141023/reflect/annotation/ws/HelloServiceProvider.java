package info.zoio.tec.java.basics.d141023.reflect.annotation.ws;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * 在webservice使用注解
 *
 * @author humyna
 *
 */
@WebService(targetNamespace="http://test",serviceName="HelloService")
public class HelloServiceProvider {

	@WebResult(name="HelloString")
	@WebMethod
	public String sayHello(@WebParam(name="userName")String name){
		return "Hello," + name;
	}

	@Oneway
	@WebMethod(action="userLogin",operationName="userLogin")
	public void login(){
		System.out.println("User has logged on");
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new HelloServicePublisher());
		thread.start();
	}
}
