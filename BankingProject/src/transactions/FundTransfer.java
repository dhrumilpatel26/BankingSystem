package transactions;

import accounts.Account;

public class FundTransfer {
	public boolean transfer(Account formaccount,Account toaccount,double amount)
	{
		if(formaccount.getacc_bal()>=amount)
		{
			formaccount.setacc_bal(formaccount.getacc_bal()-amount);
			toaccount.setacc_bal(toaccount.getacc_bal()+amount);
			return true;
		}
		return false;
	}
}
