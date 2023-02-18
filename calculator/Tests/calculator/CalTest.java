package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculatorpackage.calculatorclass;

class CalTest {

	@Test
	public void calAddTest() {
		assertEquals(3, calculatorclass.add(1,2), "error in add()");
		assertEquals(-3, calculatorclass.add(-1,-2), "error in add()");
		assertEquals(9, calculatorclass.add(9,0), "error in add()");
	}
	/*@Test
	public void calTestAddFail() {
		assertEquals(0, calculatorclass.add(1,2), "error in add()");
	}*/
	@Test
	public void calTestSubPass() {
		assertEquals(1, calculatorclass.substract(2,1), "error in substract()");
		assertEquals(1, calculatorclass.substract(-1,-2), "error in substract()");
		assertEquals(-1, calculatorclass.substract(1,2), "error in substract()");
	}
	/*@Test
	public void calTestSubFail() {
		assertEquals(0, calculatorclass.substract(2,1), "error in add()");
	}*/
	@Test
	public void calTestMulPass() {
		assertEquals(2, calculatorclass.multiply(2,1), "error in mul()");
		assertEquals(2, calculatorclass.multiply(-1,-2), "error in mul()");
		assertEquals(8, calculatorclass.multiply(2,4), "error in mul()");
	}
	@Test
	public void calTestDividePass() {
		assertEquals(2, calculatorclass.divide(2,1), "error in divide()");
		assertEquals(0.5, calculatorclass.divide(-1,-2), "error in divide()");
		assertEquals(2, calculatorclass.divide(10,5), "error in divide()");
	}
}
