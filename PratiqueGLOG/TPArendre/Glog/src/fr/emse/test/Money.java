package fr.emse.test;

import java.util.Objects;

public class Money implements IMoney{
	private int fAmount;
	private String fCurrency;
	
	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}
	public int amount() {
		return fAmount;
	}
	public String currency() {
		return fCurrency;
	}
	
	//question 6  
	// SURCHARGER LA CLASSE EQUALS DANS LA CLASSE MONEY POUR REUSSIR LE TEST
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Money money = (Money) obj;
		return fAmount == money.fAmount && Objects.equals(fCurrency, money.fCurrency);
	}
	
	//QUESTION 13
		public IMoney add(IMoney m) {
			return m.addMoney(this);
		}
		public IMoney addMoney(Money m) {
			if (m.currency().equals(currency())) {
				return new Money(amount()+ m.amount(), currency());}
			return new MoneyBag(this, m);
		}
		@Override
		public IMoney addMoneyBag(MoneyBag mb) {
			return mb.addMoney(this);
		}
		
	
}
