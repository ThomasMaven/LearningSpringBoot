package eu.tomaka.springboot;

import static org.junit.Assert.*;

import org.junit.Test;

import eu.tomaka.springboot.controller.HomeController;

public class AppTest {

	@Test
	public void testApp() {
		HomeController homeController = new HomeController();
		String result = homeController.home();
		assertEquals(result, "Home ready!");
	}
}
