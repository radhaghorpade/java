import java.util.Scanner;

public class Bank {
	
	int bal=100;
	
	void deposit(int a)
	{
		bal=bal+a;
		//System.out.println("Current Balence : "+bal);
	}
	
	void withdraw(int a)
	{
		if(bal>a)
		{
			bal=bal-a;
		}
		else
			System.out.println("You have Insufficient Balence..");
	}
	
	void disp()
	{
		System.out.println("Current Balence is : "+bal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b=new Bank();
		int opt=1;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		/*System.out.println("Enter Acct no :");
		int actno=sc.nextInt();
		
		System.out.println("Enter Ammount to Deposit : ");
		int amt=sc.nextInt();
		b.deposit(amt);
		b.disp();
		
		System.out.println("Enter Ammount to Withdraw : ");
		int wit=sc.nextInt();
		b.deposit(wit);
		b.disp();*/
		
		while(opt>0 && opt<=3)
		{
		System.out.println("1. Deposit  2. Withdraw  3. Balence  4. Exit\nOpt: ");
		opt=sc.nextInt();
	
			
			switch(opt)
			{
				case 1:
					System.out.println("Enter Ammount to Deposit : ");
					int amt=sc1.nextInt();
					b.deposit(amt);
					b.disp();
					break;
				
				case 2:
					System.out.println("Enter Ammount to Withdraw : ");
					int with=sc2.nextInt();
					b.withdraw(with);
					b.disp();
					break;
					
				case 3:
					b.disp();
					break;
					
				case 4:
					break;
			}
		}
	}

}

