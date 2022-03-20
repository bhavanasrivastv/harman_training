package day4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import assignmentQuesTwo.Calculator;

class CalculatorTest {

	private Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("Running before each testcase");
	}
	

	@DisplayName(value = "Parameterized Test case")

	@Test
	void add_two_number_test() {
		Assertions.assertAll(
				()->Assertions.assertEquals(4, calculator.add(2,2)),
				()->Assertions.assertEquals(14, calculator.add(12,2)),
				()->Assertions.assertEquals(114, calculator.add(112,2))
				);
	}

	@DisplayName(value = "Dividing two numbers")
	@Test
	void divide_two_number_test_positive() {
		
		Assertions.assertEquals(4, calculator.divide(16, 4));

	}
	
	@DisplayName(value = "Divide by Zero")
	@Test
	void divide_two_number_test_with_exceptions() {
		
		Assertions.assertThrows(ArithmeticException.class,()->calculator.divide(8,0));
	}
	
	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("Running after each testcase");
	}

}
