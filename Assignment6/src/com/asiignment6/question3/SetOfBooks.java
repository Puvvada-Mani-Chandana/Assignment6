package com.asiignment6.question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetOfBooks {
	private String authorName;
	List<Book> bookList = new ArrayList<Book>();
	
	public void hasBook(Book book) {
		boolean hasBook = false;
		if(bookList.contains(book)) {
			hasBook = true;
		}
		if(hasBook) {
			System.out.println("book found");
		} else {
			System.out.println("not found");
		}
	}

	public void sortByBookName() {
		Collections.sort(bookList);
		printBooks();
	}
	
	public void sortByAuthor() {
		Collections.sort(bookList, new booksOrder());
		printBooks();
	}
	
	public void printBooks() {
		for(Book book: bookList) {
			System.out.println(book);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookCollection [");
		for(int i=0; i<bookList.size();i++) {
			builder.append(" [author =");
			builder.append(bookList.get(i).getAuthor());
			builder.append(" title =");
			builder.append(bookList.get(i).getTitle());
			builder.append("]");
		}
		builder.append(" ]");
		return builder.toString();
	}
}
