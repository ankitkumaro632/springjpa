package com.jpa.springjpa;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringjpaApplicationTests extends TestCase {

	public SpringjpaApplicationTests(String testName){
		setName(testName);
	}

	public static Test suite() {
		return (Test) new TestSuite(SpringjpaApplicationTests.class);
	}
	@Test
	void contextLoads() {
		App a = new App();
		a.m1();
		a.getData();
		assertTrue(true);
	}

}
