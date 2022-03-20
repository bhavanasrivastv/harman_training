package day4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import assignmentQuesTwo.MathsApi;

class MathsApiTest {
	
	private MathsApi api;
	
	@BeforeEach
	void setUp() throws Exception {
		api = new MathsApi();
	}

	@AfterEach
	void tearDown() throws Exception { 
	api = null;
		
	}

	@Test
	void test() {
		Assertions.assertTrue(api.isEven(20));
	}

}
