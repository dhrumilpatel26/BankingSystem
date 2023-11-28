package app;



import accounts.Account;
import accounts.AccountCreation;
import transactions.*;

public class Mainclass {

	public static void main(String[] args)
	{ 
		
		AccountCreation ac=new AccountCreation();
		Account a1=ac.createAccount("sonu", 1,12121212,50000,2121,"sbi12121212");
		Account a2=ac.createAccount("deepak",2,23231212,20000,1212,"sbi325423");
		
		DepositTransaction dt1=new DepositTransaction();
		FundTransfer ft1=new FundTransfer();
		ViewAccountBalance vb1=new ViewAccountBalance();
		WithdrawTransation wt1=new WithdrawTransation();
		
		vb1.viewbalance(a1);
		dt1.deposite(a1,30000);
		vb1.viewbalance(a1);
		vb1.viewbalance(a2);
		ft1.transfer(a1, a2, 20000);
		vb1.viewbalance(a1);
		vb1.viewbalance(a2);
		
		
		
	}
}
