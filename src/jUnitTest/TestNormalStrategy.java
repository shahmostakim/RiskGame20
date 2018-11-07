package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import model.strategy.Normal;

/**
 * Test class for Normal Strategy
 * @author Shah_Mohammad_Mostakim
 * @version 2.0.0
 */

public class TestNormalStrategy {

	/**
	 * Tests number of attack attempts 
	 */
	@Test
	public void testAttackAttempts() {
		//fail("Not yet implemented");
		Normal nor = new Normal();
		int attemptsFound = nor.getAttackAttempts();
		int attemptsExpected = 1;
		assertEquals(attemptsFound, attemptsExpected);
	}
	
	@Test
	public void testGetName() {
		Normal nor = new Normal();
		String nameFound = nor.getName();
		String nameExpected = "Normal";
		assertEquals(nameFound, nameExpected);
	}

}
