package fr.emse.test;

import java.util.Objects;
import java.util.Vector;

public class MoneyBag implements IMoney {
	private Vector<Money> fMonies = new Vector<Money>();

	public MoneyBag(Money m1, Money m2) {
		appendMoney(m1);
		appendMoney(m2);
	}

	


	private void appendMoney(Money m) {
		if (fMonies.isEmpty()) {
			fMonies.add(m);
		} else {
			int i = 0;
			while ((i < fMonies.size())
			&& (!(fMonies.get(i).currency().equals(m.currency()))))
			i++;
			if (i >= fMonies.size()) {
				fMonies.add(m);
			} else {
				fMonies.set(i, new Money(fMonies.get(i).amount() +
				m.amount(),m.currency()));		
			}
		}
	}
	
	//QUESTION 8 
	// LA METHODE EQUALS DANS LA CLASSE MoneyBag POUR REUSSIR LE TEST
	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		MoneyBag moneyBag = (MoneyBag) obj;
		return Objects.equals(fMonies, moneyBag.fMonies);
	}

	//QUESTION 13
	public MoneyBag(Money... m ) {
		for (Money money : m)
			appendMoney(money);
	}
	@Override
	public IMoney add(IMoney m) {
		return m.addMoneyBag(this);
	}
	@Override
	public IMoney addMoneyBag(MoneyBag mb) {
		MoneyBag result = new MoneyBag();
		for(Money money : this.fMonies)
			result.appendMoney(money);
		for(Money monet : mb.fMonies)
			result.appendMoney(monet);
		return result;
	}
	@Override
	public IMoney addMoney(Money m) {
		appendMoney(m);
		if (fMonies.size() == 1) {
			return fMonies.get(0);
		} else {
			return this;
		}
		
	}

		
}
