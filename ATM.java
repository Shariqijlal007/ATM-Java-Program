package atmSystem;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		String userName = "Shariq Ijlal Tahir";
        String password = "1234Abcd";
        String bankName = "S.I.T Bank Limited";
        double userBalance = 500000;
 
        Scanner bankScanner = new Scanner(System.in);
        System.out.println("----------------------------Welcome to " + bankName +"----------------------------------");
        
        System.out.println("Please Enter Your PIN Number: ");
        String enteredPassword = bankScanner.nextLine();
        
        if (enteredPassword.equals(password)) {
            System.out.println("Account Name Holder : " + userName);
        }
        else 
        {System.out.println("Wrong PIN Number!");
        System.out.println("Please Run the program again.");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.exit(0);}
        
		 int balance = 500000, withdraw, deposit;
	        Scanner s = new Scanner(System.in);
	        while(true)
	        {
	            System.out.println("----------------------------Automated Teller Machine----------------------------");
	            System.out.println("Choose 1 for Withdraw                                     Choose 2 for Deposit");
	            System.out.println("Choose 3 for Check Balance                                Choose 4 for Pay Bills");
	            System.out.println("Choose 5 for EXIT");
	            System.out.print("Choose the operation you want to perform: ");
	            int n = s.nextInt();
	            switch(n)
	            {
	                case 1:
	                System.out.print("Enter money to be withdrawn: Rs.");
	                withdraw = s.nextInt();
	                if(balance >= withdraw)
	                {
	                    balance = balance - withdraw;
	                    System.out.println("Please collect your money.");
	                    System.out.println("________________________________________________________________________________");
	                }
	                else
	                {
	                    System.out.println("Insufficient Balance!");
	                    System.out.println("________________________________________________________________________________");
	                }
	                break;
	 
	                case 2:
	                System.out.print("Enter money to be deposited: Rs.");
	                deposit = s.nextInt();
	                balance = balance + deposit;
	                System.out.println("Your Money has been successfully deposited.");
	                System.out.println("________________________________________________________________________________");
	                break;
	 
	                case 3:
	                System.out.println("Balance : Rs."+balance);
	                System.out.println("________________________________________________________________________________");
	                break;
	 
	                case 4:
		                System.out.println("________________________________________________________________________________");
		                {
		                System.out.println("ATM bill services");
		                System.out.println("1)PTCL bills      2)School bills");
		                System.out.println("3)Electricity     4)GAS:SSGC,SNGPL");
		                System.out.println("________________________________________________________________________________");
		                int b; System.out.print("Select: "); b=s.nextInt();
		                if(b==1) {System.out.print("Enter your Phone no.: ");String g=s.next();
		                System.out.print("Enter amount: Rs.");int c=s.nextInt();
		                if(balance>=c){ balance=balance-c;
		                System.out.println("SUCCESSFULLY PAID");
		                System.out.println("________________________________________________________________________________");
		                } else {System.out.println("Insufficient Balance");System.out.println("________________________________________________________________________________");} break;} 
		                if(b==2) {System.out.println("1)APS   2)FG   3)FFC   4)Westminister");
		                System.out.print("Select your School : ");
		                int d=s.nextInt();
		                System.out.print("Enter amount: Rs.");int c=s.nextInt();
		                if(balance>=d){ balance=balance-c;
		                System.out.println("SUCCESSFULLY PAID");System.out.println("________________________________________________________________________________");
		                } else {System.out.println("Insufficient Balance");System.out.println("________________________________________________________________________________");} break;} 
		                if(b==3) {System.out.print("Enter your bill no.: ");String e=s.next();
		                System.out.print("Enter amount: Rs.");int c=s.nextInt();
		                if(balance>=c){ balance=balance-c;
		                System.out.println("SUCCESSFULLY PAID");System.out.println("________________________________________________________________________________");
		                } else {System.out.println("Insufficient Balance");System.out.println("________________________________________________________________________________");} break;} 
		                if(b==4) {System.out.println("1)SSGC   2)SNGPL ");
		                System.out.print("Select your Company: ");
		                int d=s.nextInt();
		                System.out.print("Enter amount: Rs.");int c=s.nextInt();
		                if(balance>=c){ balance=balance-c;
		                System.out.println("SUCCESSFULLY PAID");System.out.println("________________________________________________________________________________");
		                } else {System.out.println("Insufficient Balance");System.out.println("________________________________________________________________________________");}
		                break;}}
		                
	                case 5:
	                System.out.println("-----------------------Thank you for using using our services------------------------------");
	                System.exit(0);
	            }
	            }
	        }
	}