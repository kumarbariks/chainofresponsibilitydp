package com.hcl.designpattern.chain.impl;

import com.hcl.designpattern.chain.MoneyDispenseChain;
import com.hcl.designpattern.currency.Currency;

public class Rupees100DispenseChain implements MoneyDispenseChain {

	
	private MoneyDispenseChain moneyDispenseChain;
	@Override
	public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
		this.moneyDispenseChain = moneyDispenseChain;
	}

	@Override
	public void dispense(Currency currency) {

		if(currency.getAmount() >= 100){
			int numberOfNotes = currency.getAmount()/100;
			int remainder = currency.getAmount()% 100;
			System.out.println("Despencing  "+numberOfNotes +"Notes of Rs 100");
			if(remainder !=0){
				moneyDispenseChain.dispense(new Currency(remainder));
			}
		}else{
			moneyDispenseChain.dispense(currency);
		}
	}

}
