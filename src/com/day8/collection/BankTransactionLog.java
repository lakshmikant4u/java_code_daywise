package com.day8.collection;

import java.util.*;

public class BankTransactionLog {
	public static void main(String[] args) {
		LinkedList<String> log = new LinkedList<>();
		log.add("Deposited ₹5000");
		log.add("Withdrew ₹2000");
		log.addFirst("Account Opened");

		System.out.println("Transaction History:");
		for (String event : log) {
			System.out.println("- " + event);
		}
	}
}
