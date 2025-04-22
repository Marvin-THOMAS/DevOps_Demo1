package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {


	@Test
	void test(){
		final boolean myBoolean = false;
		Assertions.assertFalse(myBoolean);
	}


}
