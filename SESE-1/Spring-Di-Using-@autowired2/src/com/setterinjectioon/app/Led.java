package com.setterinjectioon.app;

import org.springframework.stereotype.Component;

@Component
public class Led  implements Light{

	public void lightOn() {
		System.out.println("Led On");
	}

	public Led() {
		System.out.println("led created");
	}
	
	
}
