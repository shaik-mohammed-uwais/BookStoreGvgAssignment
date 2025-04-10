package com.gvg.BookStore;

import java.util.HashMap;
import java.util.Scanner;

import com.gvg.BookData.books;
import com.gvg.user.user;

public class bookstoremain {
	public static void main(String[] args) {
		
		// creating instance of book class
		books b=new books();
		HashMap<String, String> bookmap= b.getBooks();
		System.out.println("=========== books avalable ==========");
		bookmap.forEach((auth,bname)->{ 
			System.out.println("Author: " + auth + ", Book: " + bname);
		});
		
		// taking input from user 
		Scanner sc = new Scanner(System.in);
		user user=new user();
		boolean f=true;
		while(f) {
			
			// displaying options 
			System.out.println("1. create user ");
			System.out.println("2. borrow book ");
			System.out.println("3. return book ");
			System.out.println("4. get user details ");
			
			//reading the operation to be performed
			int key;
		    try {
		        key = sc.nextInt();
		        sc.nextLine(); 
		    } catch (Exception e) {
		        System.out.println("Invalid input! Please enter a number.");
		        sc.nextLine();
		        continue;
		    }
			
			switch (key) {
			case 1: {
				System.out.println("enter user name : ");
				String name=sc.nextLine();
				user.createUser(name);
				break;
			}
			case 2:{
				System.out.println("enter user name ");
				String bruser =sc.nextLine();
				System.out.println("enter book name that is to be borrowed ");
				String brbook =sc.nextLine();
				user.borrowBook(bruser, brbook);
				break;
			}
			case 3:{
				System.out.println("enter user name ");
				String bruser =sc.nextLine();
				System.out.println("enter book name that is to be returned ");
				String brbook =sc.nextLine();
				user.returnBook(bruser, brbook);
				break;
			}
			case 4:{
				System.out.println(user.getUser());
				break;
			}
			default:
				System.out.println("** invalid option **");
				break;
			}
			System.out.println("do you want to continue yes= '1' or exit= '0' ");
			
			
			//confirming user intut values
			int ch;
			try {
				ch=sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("plz enter value between 1 and 0 ");
				sc.nextLine();
				continue;
			}
			if(ch==0) {
				f=false;
			}
			sc.nextLine();
			
		}
		sc.close();
	}
}
