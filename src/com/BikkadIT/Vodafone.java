package com.BikkadIT;

public class Vodafone implements Sim {

	public Vodafone() {
		super();
		System.out.println("Vodafone class constructor");
	}

	@Override
	public void calling() {
		System.out.println("calling via Vodafone");
		
	}

	@Override
	public void browse() {
		System.out.println("browse via Vodafone");
		
	}

}
