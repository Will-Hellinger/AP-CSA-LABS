public class Account 
{
	private String first;
	private String last;
	private int acctNum;
	private double balance;
	private static int num = 99;
	
	public Account(Account a){
		first = a.getFirst();
		last = a.getLast();
		balance = a.getBalance();
		num++;
		acctNum = num;
	}

	public Account(String first, String last, double balance){
		this.first = first;
		this.last =last;
		this.balance = balance;
		num++;
		acctNum = num;
	}

	public Account(){
		first = "";
		last = "";
		balance = 0;
		num++;//increments the current value of the static variable num
		acctNum = num;//assigns the new value of num as the account number
	}

	public void setFirst(String first){
		this.first = first;
	}

	public void setLast(String last){
		this.last = last;
	}

	public void deposit(double deposit){
		balance += deposit;
	}

	public String getFirst(){
		return first;
	}

	public String getLast(){
		return last;
	}

	public double getBalance(){
		return balance;
	}

	public int getAcctNum(){
		return acctNum;
	}

	public boolean withdrawal(double amount){
		if (balance >= amount){
			balance -= amount;
			return true;
		}else{
			return false;
		}
	}

	public String toString(){
    String temp = "Customer Name: " + first + " " + last + "\nAccount #: " + acctNum + "\nCurrent Balance: "  + balance;
    return temp;
  }
}