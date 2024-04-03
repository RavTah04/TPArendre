package fr.emse.test;

import org.junit.runners.Suite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

//11
//REGROUPE LES TESTS POUR LES CLASSES MONEY ET MONEYBAG EN LES EXECUTANT ENSEMBLE
@RunWith(Suite.class)
@SuiteClasses(value = { MoneyTest.class, MoneyBagTest.class })
public class AllTests {
	
}
