package javaP;

import java.util.Scanner;

/**
 * @author Amanshu Sahu
 *
 */
public class Task3 {
	public static void main(String args[]) {
		int balance = 5000;
		int withdraw;
		int deposit;
		int transfer;
		String username;
		String password;
		Scanner s = new Scanner(System.in);
		// Login
		System.out.println("Login ");
		System.out.println("Enter the username: ");
		String Username = s.nextLine();
		System.out.println("Enter the password: ");
		String Password = s.nextLine();
		if (Username.equals("Amanshu_sahu") && (Password.equals("Pass@123"))) {
			System.out.println("Logged in successfully");
		} else {
			System.out.println("Incorrect username and password");
		}
		System.out.println();
		while (true) {
			System.out.println("-----ATM-----");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Transfer");
			System.out.println("Choose 4 for Check Balance");
			System.out.println("Choose 5 for QUIT");
			System.out.print("Choose the operation you want to perform:");
			int n = s.nextInt();
			switch (n) {

			// Withdraw
			case 1:
				System.out.print("Enter money to be withdrawn:");
				withdraw = s.nextInt();
				if (balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				} else {
					System.out.println("Insufficient Balance");
				}
				System.out.println("");
				break;

			// Deposit
			case 2:
				System.out.print("Enter money to be deposited:");
				deposit = s.nextInt();
				balance = balance + deposit;
				System.out.println("Your Money has been successfully depsited");
				System.out.println("");
				break;

			// Transfer
			case 3:
				System.out.println("Enter the amount you want to transfer :");
				transfer = s.nextInt();
				if (transfer <= balance) {
					balance -= transfer;
					System.out.println("\nyour money has been successfully transferred");
					System.out.println("After transfer remaining balance is :" + balance);
					String trans3 = "\tRs Transferred - " + balance;
					System.out.println("Transaction history of Transfer :" + transfer);
				}
				System.out.println();

				// Check Balance
			case 4:
				System.out.println("Here is your total balance left !!!");
				System.out.println("Balance : " + balance);
				System.out.println("");
				break;

			// Quit
			case 5:
				System.exit(0);
				System.out.println("you have exited please login again !!!");
			}
		}
	}
}