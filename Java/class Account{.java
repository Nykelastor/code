class Account{
	String Name;
	String type;
	int no;
	double balance;
	Account()
	{
	Name="Minor";
	type="Savings";
	no=123456;
	balance=1000;
	}
Account(String Name,String type,int no,double balance)
	{
	this.Name=Name;
	this.type=type;
	this.no=no;
	this.balance=balance;
	}
}


class AccountThis{
	public static void main(String args[]){
		Account a1=new Account();
		System.out.println("Name ="+a1.Name);
		System.out.println("Account type ="+a1.type);
		System.out.println("Accont Number ="+a1.no);
		System.out.println("Balance ="+a1.balance);
		Account a2=new Account("Java","Current",456789,2000);
		System.out.println("Name ="+a2.Name);
		System.out.println("Account type ="+a2.type);
		System.out.println("Accont Number ="+a2.no);
		System.out.println("Balance ="+a2.balance);
	}
}