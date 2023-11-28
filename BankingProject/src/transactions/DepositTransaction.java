package transactions;

import accounts.Account;

public class DepositTransaction {
	public void  deposite(Account s1,double deposit_amount)
	{
			s1.setacc_bal(s1.getacc_bal()+deposit_amount);	
	}

}
