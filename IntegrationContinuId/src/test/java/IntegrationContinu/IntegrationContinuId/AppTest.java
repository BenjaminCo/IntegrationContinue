package IntegrationContinu.IntegrationContinuId;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest{

	@Test 
	public void TestCaseTypeTest() throws Exception {
		assertNotNull(App.class);
	}

	@Test 
	public void TestCaseInstantiation() throws Exception {
		App target = new App();
		assertNotNull(target);
	}

	@Test 
	public void TestCaseMain_A$StringArray() throws Exception {
		String[] args = new String[] {};
		App.main(args);
	}

	@Test 
	public void TestCaseFonctionAddition_A$int$int() throws Exception {
		
		App target = new App();
		int x = 1;
		int y = 2;
		int actual = target.fonctionAddition(x, y);
		int expected = 3;
		assertEquals(expected, actual);
	}

}