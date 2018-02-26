package com.projectName.moduleName.starterKit.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.projectName.moduleName.starterKit.restTemplate.CallAPI;
import com.projectName.moduleName.starterKit.service.SampleService;

public class SampleControllerTest {
	
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	/*@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}*/
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	
	/*@Test
	public void helloGetTest() throws Exception {
		
		mockMvc.perform(get("/")).andExpect(status().isOk())
		                .andExpect(content().string("\"rignt now you are running prod mode\""));
		
		
		
	}*/
	
	
	@Test
	public void testGetAppMode_1()
		throws Exception {
		SampleController fixture = new SampleController();
		fixture.service = new SampleService();
		fixture.callApi = new CallAPI();
		fixture.appMode = "";

		String result = fixture.getAppMode();

		// add additional test code here
		assertEquals("", result);
	}

	
	@Test
	public void testHelloGet_1()
		throws Exception {
		SampleController fixture = new SampleController();
		fixture.service = new SampleService();
		fixture.callApi = new CallAPI();
		fixture.appMode = "";
		String name = "a";

		String result = fixture.helloGet(name);

		// add additional test code here
		assertEquals("Hello a. Your application is running on  mode.", result);
	}

	/**
	 * Run the String helloGet(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 5:33 PM
	 */
	@Test(expected = com.projectName.moduleName.starterKit.Exceptions.UserIdNotFoundException.class)
	public void testHelloGet_2()
		throws Exception {
		SampleController fixture = new SampleController();
		fixture.service = new SampleService();
		fixture.callApi = new CallAPI();
		fixture.appMode = "";
		String name = "";

		String result = fixture.helloGet(name);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String helloPost(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/20/18 5:33 PM
	 */
	@Test
	public void testHelloPost_1()
		throws Exception {
		SampleController fixture = new SampleController();
		fixture.service = new SampleService();
		fixture.callApi = new CallAPI();
		fixture.appMode = "";
		String name = "";

		String result = fixture.helloPost(name);

		// add additional test code here
		assertEquals("Hello . Your application is running on  mode.", result);
	}

		@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	
}