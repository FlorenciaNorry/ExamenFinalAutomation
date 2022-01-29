package com.webautomation.ejercicio1;

import org.testng.annotations.BeforeTest;

public class AnnotationTests {

	@BeforeTest
	public void login() {
		System.out.println("login");
	}
}
