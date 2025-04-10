package com.gvg.user;

import java.util.ArrayList;
import java.util.HashMap;
import com.gvg.BookData.books;

public class user {
	//blue print to sstore user details
	private static final HashMap<String, ArrayList<String>> users= new HashMap<>();
	
	// creating new user
	public static void createUser(String name) {
		if(users.containsKey(name)){
			System.out.println("user alredy exists ");
		}else {
			ArrayList<String> borrowedbooks=new ArrayList<String>();
			users.put(name, borrowedbooks);
			System.out.println("user created successfully ** ");
		}
	}

	//borrowing book from library
	public static void borrowBook(String name ,String borrowed)
	{
		if(users.containsKey(name)){
			if(books.getBooks().containsValue(borrowed)) {
				if(users.get(name).contains(borrowed)) {
					System.out.println("alredy boroowed the same book ");
				}else {
					users.get(name).add(borrowed);
					System.out.println("borrowed successfully ** ");
				}
			}else {
				System.out.println("book you want to borrow doesent exist ");
			}
		}else {
			System.out.println("user doesent exist create user first :( ");
		}
	}
	
	//returining book from user to library
	public static void returnBook(String name ,String bname)
	{	
		if(users.containsKey(name)){
			if(books.getBooks().containsValue(bname)) {
				if(users.get(name).contains(bname)) {
					int index=users.get(name).indexOf(bname);
					users.get(name).remove(index);
					System.out.println("returned book successfully ** ");
				}else {
					System.out.println("cannot return book which isnt borrowed ");
				}
			}else {
				System.out.println("cannot return the book which isnt avalable in library ");
			}
		}else {
			System.out.println("user doesent exist create user successfully :( ");
		}
	}
	
	//details of every user and books borrowed 
	public static HashMap<String, ArrayList<String>> getUser(){
		return users;
	}
}
