package lab.part2;

import java.util.Scanner;

public class BankAccThis extends Acc1 {
	
	public static void main(String[] args) {
		String name;
		int accNo,bal,accType;
		Scanner scan= new Scanner(System.in);
		int num;

		Acc1 obj=new BankAccThis();
		
		System.out.print("Enter account holder name: ");
		name=scan.nextLine();
		
		
		System.out.println("Enter account type\n1. Current account\n2. Saving account");
		accType=scan.nextInt();
		
		if(accType==1) {
			bal=5000;
			System.out.print("Enter account number: ");
			accNo=scan.nextInt();
			System.out.println("\nYour current account is created succsessfully...");
			obj.createAcc(name, accNo, bal, "Current Account");
		}
		else if(accType==2) {
			bal=2500;			
			System.out.print("Enter account number: ");
			accNo=scan.nextInt();
			System.out.println("\nYour current account is created succsessfully...");
			obj.createAcc(name, accNo, bal, "Current Account");
		}
		
		while(true) {
			System.out.println("\nFor Account Info....\n1. To check Balance\n2. To Deposit\nTo exit press any other number");
			num=scan.nextInt();
			if(num==1) {
				obj.balanceInfo(obj.name, obj.bal);
			}
			else if(num==2) {
				obj.updateBal();
			}
			else
				break;
				
		}
	}

}
class Acc1 extends Info1{
	String name,accType;
	int accNo,bal;
	Scanner scan=new Scanner(System.in);
	//Method to initialize values
		void createAcc(String name, int accNo, int bal, String accType) {
			this.name=name;
			this.accNo=accNo;
			this.bal=bal;
			this.accType=accType;
				accInfo(name,accNo,accType);
		}
		void updateBal() {
			System.out.print("Enter the amount to deposit: ");
			int amount=scan.nextInt();
			bal+=amount;
			balanceInfo(name,bal,amount);
		}
		
}

class Info1 {
	//Method to know account info
	void accInfo(String name, int accNo,String type) {
		System.out.printf("Account holder:\t%s\nAccount No:\t%d\nAcc Type:\t%s\n_____________________________________________\n\n",name,accNo,type);
	}
	
	//To know balance info
	void balanceInfo(String name, int bal) {
		System.out.printf("Account holder:\t%s\nBalance:\t%d\n",name,bal);
	}
	
	//To know balance info after deposit
	void balanceInfo(String name, int bal, int amount) {
		System.out.printf("Account holder:\t%s\nDeposit:\t%d\nBalance:\t%d\n",name,amount,bal);	
	}

}