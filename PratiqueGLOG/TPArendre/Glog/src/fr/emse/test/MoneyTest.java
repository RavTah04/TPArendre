package fr.emse.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
	private Money m12CHF;
	private Money m14CHF;
	
	//Question7: Using annotation @Before 
	@Before
	public void setUp() {
		m12CHF = new Money(12, "CHF");
		m14CHF = new Money(14,"CHF");
		
	}
	
	@Test
	public void testSimpleAdd() {
			//Money m12CHF = new Money(12, "CHF"); // create BD
			//Money m14CHF = new Money(14, "CHF");
		Money expected = new Money(26, "CHF");
		//QUESTION 13 : CAST MONEY 
		Money result = (Money) m12CHF.add(m14CHF); // exécution de la méthode testée
		assertTrue(expected.equals(result)); // comparaison
	}
	@Test
	public void testEquals() {
			//Money m12CHF= new Money(12, "CHF");
			//Money m14CHF= new Money(14, "CHF");
	assertTrue(!m12CHF.equals(null)); 
	assertEquals(m12CHF, m12CHF);
	assertEquals(m12CHF, new Money(12, "CHF"));
	assertTrue(!m12CHF.equals(m14CHF));
	}



}
