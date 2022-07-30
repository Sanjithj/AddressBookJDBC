package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	public static void addContact()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name :");
        
        String first_name = sc.next();
        System.out.println("Enter your last name :");
        
        String last_name = sc.next();
        sc.nextLine();
        System.out.println("Enter your address :");
        
        String address = sc.nextLine();
        System.out.println("Enter your city :");
        
        String city = sc.next();
        System.out.println("Enter your state :");
        
        String state = sc.next();
        System.out.println("Enter your zip code :");
        
        int zip = sc.nextInt();
        System.out.println("Enter your phone number :");
        
        long phone = sc.nextLong();
        System.out.println("Enter your email id :");
        
        String email_id = sc.next();
        Contacts contact = new Contacts(first_name, last_name, address, city, state, zip, phone, email_id);
    }

	public static void main(String[] args) {
		System.out.println("Welcome to Address book");
		
	        AddressBook.addContact();
	        System.out.println();
	}
}
