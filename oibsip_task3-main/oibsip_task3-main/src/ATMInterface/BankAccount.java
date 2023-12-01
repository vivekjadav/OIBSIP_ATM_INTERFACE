package ATMInterface;

import java.util.Scanner;

public class BankAccount {
	String name;
	String Username;
	String Password;
	String AccountNo;
	float Balance = 10000f;
	int Transactions = 0;
	String TransactionHistory = "";

	

	private static int takeIntegerInput(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void register() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Your Name - ");
		this.name = Sc.nextLine();
		System.out.println("Enter Your Username - ");
		this.Username = Sc.nextLine();
		System.out.println("Enter Your Password - ");
		this.Password = Sc.nextLine();
		System.out.println("Enter Your Account Number - ");
		this.AccountNo = Sc.nextLine();
		System.out.println("Registration Completed. Please Log in !! ");

	}

	public boolean login() {
		Scanner Sc = new Scanner(System.in);
		boolean islogin = false;

		while (!islogin) {
			System.out.println("Enter Your Username  - ");
			String username = Sc.nextLine();
			if (username.equals(Username)) {
				while (!islogin) {
					System.out.println("Enter Your Password  - ");
					String password = Sc.nextLine();
					if (password.equals(Password)) {
						System.out.println("Login Successful ");
						islogin = true;

					} else {
						System.out.println("Incorrect Password !!");
					}

				}

			} else {
				System.out.println("Username Not Found !!");
			}

		}

		return islogin;
	}
	
	public void withdrow (){
		System.out.println("Enter Amount to Withdrow ");
		Scanner Sc = new Scanner(System.in);
		float amount = Sc.nextFloat();
		try{
			if(Balance >= amount){
				Transactions++;
				Balance -= amount;
				System.out.println("Withdrow Successfully ");
				String str = amount + "Rs Withdrowed\n";
				TransactionHistory = TransactionHistory.concat(str);
				
			}else{
				System.out.println("/nInsufficient Balanced ");
				
			}
			
			
		}catch (Exception e){
			
		}
				
	}
	
	public void deposit(){
		System.out.println("Enter Amount to deposit ");
		Scanner Sc = new Scanner(System.in);
		float amount = Sc.nextFloat();
		try{
			if( amount <= 10000f){
			Transactions++;
			Balance += amount ;
			System.out.println("Successfully Deposited");
			String str = amount + "Rs Deposited\n";
			TransactionHistory = TransactionHistory.concat(str);
			
			}else{
				System.out.println("Sorry .. Limit is 10000.00 !!");
			}
			
		}catch(Exception e){
			
		}
	}
	public void transfer(){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Receipent Name - ");
		String Receipent = Sc.nextLine();
		System.out.println("Enter Amount to Tansfer - ");
		float amount = Sc.nextFloat();
		try{	
			if( Balance >= amount ){
	        if( Balance <= 50000f ){	
			Transactions++;
			Balance -= amount ;
			System.out.println("Successfully Transfered to" + Receipent);
			String str = amount + "Rs Transfer to " + Receipent + "\n";
			TransactionHistory = TransactionHistory.concat(str);
			
			}else{
				System.out.println("Sorry .. Limit is 50000.00 !!");
			}
			
		}else{
			System.out.println("Insuficient Balanced	!!");
		}
			
		}catch(Exception e){
		}
		
	}
    public void checkBalanced(){
    	System.out.println("\n " + Balance + " Rs ");

}  public void transHistory(){
	if(Transactions == 0 ){
		System.out.println("Empty ");
		
	}else{
		System.out.println("\n " + TransactionHistory);
		
	}
	
}

}
 

 
  