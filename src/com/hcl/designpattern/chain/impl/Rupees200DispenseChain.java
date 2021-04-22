package com.hcl.designpattern.chain.impl;

import com.hcl.designpattern.chain.MoneyDispenseChain;
import com.hcl.designpattern.currency.Currency;

public class Rupees200DispenseChain implements MoneyDispenseChain {

	
	private MoneyDispenseChain moneyDispenseChain;
	@Override
	public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
		this.moneyDispenseChain = moneyDispenseChain;
	}

	@Override
	public void dispense(Currency currency) {

		if(currency.getAmount() >= 200){
			int numberOfNotes = currency.getAmount()/200;
			int remainder = currency.getAmount()% 200;
			System.out.println("Despencing  "+numberOfNotes +"Notes of Rs 200");
			if(remainder !=0){
				moneyDispenseChain.dispense(new Currency(remainder));
			}
		}else{
			moneyDispenseChain.dispense(currency);
		}
	}


}
