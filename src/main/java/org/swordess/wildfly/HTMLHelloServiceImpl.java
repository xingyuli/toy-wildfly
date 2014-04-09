package org.swordess.wildfly;

public class HTMLHelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String to) {
		return "<h1>Hello " + to + "!</h1>";
	}

}
