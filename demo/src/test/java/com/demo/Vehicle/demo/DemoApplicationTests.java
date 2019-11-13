package com.demo.Vehicle.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
classes = LocationServiceTest.class
//webEnvironment = WebEnvironment.DEFINED_PORT;
)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
