package com.lex.demo;

public class Account {

	double balance;

	public static void main(String args[]) {
		Account account1 = null; // Line1
		Account account2 = null; // Line2
		account1 = new Account(); // Line 3
		account2 = new Account(); // Line 4
		account2 = account1; // Line 5
		account1 = new Account(); // Line 6
		System.out.println(account1.balance);

	}

}
