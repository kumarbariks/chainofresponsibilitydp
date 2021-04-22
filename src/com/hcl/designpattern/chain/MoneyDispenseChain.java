package com.hcl.designpattern.chain;

import com.hcl.designpattern.currency.Currency;

public interface MoneyDispenseChain {

	public abstract void setNextChain(MoneyDispenseChain moneyDispenseChain);
	public abstract void dispense(Currency currency);
}
