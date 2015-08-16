//Avraham Moryosef
//CS 420
//7/17/15

package testmyclasses;

import myclasses.SvgsAcct;
import myclasses.ChkgAcct;

public class TestBankAcct
{
	public static void main(String[] args)
	{
		SvgsAcct save = new SvgsAcct(111, 300);
		
		ChkgAcct check1 = new ChkgAcct(222, 500);
		ChkgAcct check2 = new ChkgAcct(333, 600);
		
		System.out.println("Beginning balances:");
		
		System.out.println(save);
		System.out.println(check1);
		System.out.println(check2);
		
		System.out.println("\nEnd of month 1:");
		
		save.deposit(100);
		save.withdraw(250);
		
		check1.deposit(150);
		check1.withdraw(100);
		check1.withdraw(200);
		
		check2.deposit(100);
		check2.deposit(150);
		check2.withdraw(50);
		
		save.monthEnd();
		check1.monthEnd();
		check2.monthEnd();
		
		System.out.println(save);
		System.out.println(check1);
		System.out.println(check2);	
		
		SvgsAcct.setInterestRate(0.05);
		ChkgAcct.setMonthlyFee(5.00);
		ChkgAcct.setPerCheckFee(0.18);
		
		System.out.println("\nEnd of month 2:");
		
		save.deposit(750);
		save.withdraw(400);
		save.withdraw(50);
		save.withdraw(100);
		
		check1.deposit(300);
		check1.withdraw(50);
		check1.withdraw(60);
		check1.withdraw(70);
		
		check2.withdraw(10);
		
		save.monthEnd();
		check1.monthEnd();
		check2.monthEnd();
		
		System.out.println(save);
		System.out.println(check1);
		System.out.println(check2);	
		
		

	}

}
