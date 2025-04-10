package com.gvg.BookData;
import java.util.HashMap;

public class books{
	private static final HashMap<String, String> Books = new HashMap<>();

	public books(){
		Books.put("George R. R. Martin", "A Game of Thrones");
	    Books.put("J.K. Rowling", "Harry Potter and the Sorcerer's Stone");
	    Books.put("F. Scott Fitzgerald", "The Great Gatsby");
	    Books.put("Paulo Coelho", "The Alchemist");
	    Books.put("Dan Brown", "The Da Vinci Code");
	}

	public static HashMap<String, String> getBooks() {
		return Books;
	}
}
