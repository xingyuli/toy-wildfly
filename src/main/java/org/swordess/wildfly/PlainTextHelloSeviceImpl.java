package org.swordess.wildfly;

import javax.enterprise.inject.Alternative;

@Alternative
public class PlainTextHelloSeviceImpl implements HelloService{

	@Override
	public String sayHello(String to) {
		return "Hello " + to + "!";
	}

}
