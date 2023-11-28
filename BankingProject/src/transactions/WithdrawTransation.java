package transactions;

import accounts.Account;

public class WithdrawTransation {

	public boolean withdraw(Account s1,double withamount)
	{
		if(s1.getacc_bal()>=withamount) 
		{
			s1.setacc_bal(s1.getacc_bal()-withamount);
			return true;
		}
	return false;
	}
}
