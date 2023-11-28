package accounts;

public class Account {
	private String Cname;
	private int Cid;
	private long acc_number;
	private double acc_bal;
	private int pin;
	private String ifsc_code; 

	public Account(String Cname,int Cid,long acc_number,double acc_bal,int pin,String ifsc_code)
	{
		this.Cname=Cname;
		this.Cid=Cid;
		this.acc_number=acc_number;
		this.acc_bal=acc_bal;
		this.pin=pin;
		this.ifsc_code=ifsc_code;
	}
	public String getCname()
	{
		return Cname;
		
	}
	public int getCid()
	{
		return Cid;
		
	}
	public long getacc_number()
	{
		return acc_number;
		
	}
	public double getacc_bal() {
		return acc_bal;	
	}
	public int getpin()
	{
		return pin;
		
	}
	public String getifsc_code()
	{
		return ifsc_code;
		
	}
	public void setCname(String Cname)
	{
		this.Cname=Cname;
	}
	public void setCid(int Cid)
	{
		this.Cid=Cid;
	}
	public void setacc_number(long acc_number)
	{
		this.acc_number=acc_number;
	}
	public void setacc_bal(double acc_bal)
	{
		this.acc_bal=acc_bal;
	}
	public void setpin(int pin)
	{
		this.pin=pin;
	}
	public void setifsc_code(String ifsc_code)
	{
		this.ifsc_code=ifsc_code;
	}
	
	
}
