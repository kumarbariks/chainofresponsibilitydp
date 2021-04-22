package com.hcl.designpattern;

import java.util.Scanner;

import com.hcl.designpattern.chain.impl.ATMMachineDispenseChain;
import com.hcl.designpattern.currency.Currency;

public class ClientTest {

	public static void main(String[] args){
		System.out.println("Hello world");
		
		ATMMachineDispenseChain atmMachineDispenseChain = new ATMMachineDispenseChain();
		Scanner scanner = null;
		while(true){
			int amount = 0;
			
		try{
			System.out.println("Please enter amount to despense: ");
			scanner = new Scanner(System.in);
			amount = scanner.nextInt();
			if(amount %100 != 0){
				System.out.println("amount should be multiple of rupess 100");
				return;
			}else{
				atmMachineDispenseChain.getMoneyDispenseChain1().dispense(new Currency(amount));
			}
		}catch(Exception e){
			e.printStackTrace();
		}/*finally{
			if(scanner != null)
				scanner.close();
		}*/
		}
	}
}
