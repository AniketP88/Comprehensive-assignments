	package com.java.demo;

public class Main {
	
	public static void main(String[] args) {
        // Create a Savings Account
        Account savingsAccount = new SavingsAccount(2500, 5.2);
        savingsAccount.displayBalance();
        savingsAccount.calculateInterest();
        System.out.println("Final amount after interest added : ");
        savingsAccount.displayBalance();

        // Create a Current Account
        Account currentAccount = new CurrentAccount(1500, 2.5);
        currentAccount.displayBalance();
        currentAccount.calculateInterest();
        System.out.println("Final amount after interest added : ");
        currentAccount.displayBalance();

        // Deposit and withdraw from accounts
        savingsAccount.depositAMount(400);
        savingsAccount.displayBalance();
        savingsAccount.withdrawAmount(100);
        savingsAccount.displayBalance();

        currentAccount.depositAMount(2000);
        currentAccount.displayBalance();
        currentAccount.withdrawAmount(200);
        currentAccount.displayBalance();
    }
}
