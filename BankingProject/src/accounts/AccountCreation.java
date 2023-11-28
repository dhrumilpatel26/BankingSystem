package accounts;

public class AccountCreation {

 public Account createAccount(String Cname,int Cid,long acc_number,double acc_bal,int pin,String ifsc_code)
	{
		Account a1=new Account(Cname,Cid,acc_number,acc_bal,pin,ifsc_code);
		return a1;
	}
}