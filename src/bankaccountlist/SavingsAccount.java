package bankaccountlist;

import practicequestionpart2.SavingAccount;

public class SavingsAccount implements Comparable<SavingsAccount>{

    float acc_balance;
    int acc_ID;
    String accountHoldername;
    String isSalaryAccount;
    
   SavingsAccount(float acc_balance,int acc_ID,String accountHolderName,String isSalaryAccount)
   {
   	this.acc_balance=acc_balance;
   	this.acc_ID=acc_ID;
   	this.accountHoldername=accountHolderName;
   	this.isSalaryAccount=isSalaryAccount;
   	}
	
	public float getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(float acc_balance) {
		this.acc_balance = acc_balance;
	}
	
	public int getAcc_ID() {
		return acc_ID;
	}
	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}
	
	public String getAccountHoldername() {
		return accountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		this.accountHoldername = accountHoldername;
	}
	
	public String isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(String isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ", acc_ID=" + acc_ID + ", accountHoldername="
				+ accountHoldername + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
    
	public boolean equals(Object obj) {
       SavingAccount sa = (SavingAccount) obj;
       if(sa.getAcc_ID()==this.acc_ID)
       	return true;
       if (sa.getAcc_ID() == this.acc_ID) {
       	//sa.acc_balance-=this.acc_balance;
       	withdraw(this.acc_balance);
           sa.setAcc_balance(this.acc_balance);
           return true;
       }
       else if (sa.getAcc_ID() == this.acc_ID) {
       	sa.setAcc_balance(sa.getAcc_balance() + this.acc_balance);
           sa.setAcc_balance(sa.getAcc_balance());
           return true;
       }
       else {
           return false;
       }
   }
	
	public void withdraw(float acc_balance2)
	{
		this.acc_balance-=acc_balance2;
		
	}
	
	  public boolean contains(Object o) {
		  SavingAccount sa=(SavingAccount) o;
		  if(sa.getAcc_ID()==this.acc_ID)
		  {
			  return true; 
		  }
		  else 
			  return false;
	  }
	 
	
	 public int hashCode() {
	        return (int) this.acc_ID;
	    }

	@Override
	public int compareTo(SavingsAccount o) {
		return getAcc_ID()-o.getAcc_ID();
	}
}
