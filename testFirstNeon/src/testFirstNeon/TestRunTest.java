package testFirstNeon;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;



public class TestRunTest {

	@Test 
	public void type() throws Exception {
		assertNotNull(TestRun.class);
	}

	@Test 
	public void instantiation() throws Exception {
		TestRun target = new TestRun();
		assertNotNull(target);
	}

	@Test 
	public void main_A$StringArray() throws Exception {
		String[] args = new String[] {};
		TestRun.main(args);
	}

	@Test 
	public void fonctionAddition_A$int$int() throws Exception {
		
		TestRun target = new TestRun();
		int x = 1;
		int y = 2;
		int actual = target.fonctionAddition(x, y);
		int expected = 3;
		assertEquals(expected, actual);
	}

}
