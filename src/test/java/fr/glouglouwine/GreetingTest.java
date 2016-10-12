package fr.glouglouwine;

import org.junit.Test;
import org.junit.Assert;

public class GreetingTest {

	@Test
	public void testGetMessage() throws Exception {
		// Setup
		Greeting greeting = new Greeting();
		// Test
		Assert.assertEquals("I say Hello for You", greeting.getMessage());
		// Teardown
	}

	@Test
	public void testGetMessageFromResource() throws Exception {
		// Setup
		Greeting greeting = new Greeting();
		// Test
		Assert.assertEquals("I am a text file !!", greeting.getMessageFromResource());
	}

}
