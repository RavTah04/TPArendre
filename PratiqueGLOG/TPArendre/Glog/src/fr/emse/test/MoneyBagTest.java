package fr.emse.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MoneyBagTest {
	private Money f12CHF;
	private Money f14CHF;
	private Money f7USD;
	private Money f21USD;
	private MoneyBag fMB1;
	private MoneyBag fMB2;
	
	//QUESTION 9 - CREATION DES 2 METHODES SPECIFIEES ANNOTEE @Before, @Test 'testBagEquals'
	@Before
	public void setUp() {
		f12CHF= new Money(12, "CHF");
		f14CHF= new Money(14, "CHF");
		f7USD= new Money( 7, "USD");
		f21USD= new Money(21, "USD");
		fMB1= new MoneyBag(f12CHF, f7USD);
		fMB2= new MoneyBag(f14CHF, f21USD);
		//fMB2= new MoneyBag(new Money(14, "CHF"),new Money(21,"USD"));
	}
	//VERIFIER SI LES OPERATIONS D'EGALITE FONCTIONNE
	@Test
	public void testBagEquals() {
		assertTrue(!fMB1.equals(null)); 
		assertEquals(fMB1, fMB1); 
		assertTrue(!fMB1.equals(f12CHF)); 
		assertTrue(!f12CHF.equals(fMB1)); 
		assertTrue(!fMB1.equals(fMB2));
	}
	
	
	//QUESTION 11 - 12
	// VERIFICATION SI L'AJOUT D'UN MONEYBAG A UN SIMPLE MONEY FONCTIONNE
	@Test
	public void testBagSimpleAdd() {
		Money bag[] = {f12CHF,f7USD, f12CHF};
		MoneyBag expected = new MoneyBag(bag);
		assertTrue(expected.equals(fMB1.add(f12CHF)));
		
	}
	//VERIFICATION SI AJOUT D'UN MONEY A UN MONEYBAG FONCTIONNE
	@Test
	public void testSimpleBagAdd() {
		Money bag[] = {f12CHF,f7USD, new Money(10,"EUR")};
		MoneyBag expected = new MoneyBag(bag);
		assertTrue(expected.equals(new Money(10,"EUR").add(fMB1)));
	}
	//VERIFICATION SI AJOUT DE DEUX MONEYBAG FONCTIONNE
	@Test
	public void testBagBagAdd() {
		Money bag[] = {f12CHF,f7USD, f14CHF, f21USD};
		MoneyBag expected = new MoneyBag(bag);
		assertEquals(expected,fMB1.add(fMB2));
	}
	
	//QUESTION 14
	//SIMPLIFICATION DES MONEYBAG EN MONEY (JEU DE TEST) 
	@Test
	public void testSimplifyMoneyBag() {
		//CREE UN MONEYBAG AVEC UNE SEULE VALEUR EN CHF
		MoneyBag moneyBag = new MoneyBag(new Money(12, "CHF"));
		IMoney result = moneyBag.add(new Money(-12, "CHF")); //AJOUTER -12 CHF AU MoNEYBAG? SIMPLIFICATION MONEYBAG EN UN SIMPLE MONEY DE VALEUR 0
		assertTrue(result instanceof Money);//VERIFIER SI LE RESULTAT EST UN MONEY
		assertEquals(new Money(0, "CHF"), result); // VERIFIER SI LE MONEY RESULTANT A UNE VALEUR DE 0 CHF 
	}
}
