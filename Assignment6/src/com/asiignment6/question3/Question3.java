package com.asiignment6.question3;

import java.util.List;

public class Question3 {

	public static void main(String[] args) {
			Book book = new Book(1, "java", "james");
			Book book1 = new Book(2, "c++", "charles");
			Book book2 = new Book(3, "python", "guido");
			Book book3 = new Book(4, "c", "kanethkar");
			
			
			SetOfBooks bookCol = new SetOfBooks();
			bookCol.bookList.add(book);
			bookCol.bookList.add(book1);
			bookCol.bookList.add(book2);
			bookCol.bookList.add(book3);
			
			System.out.println("before sorting");
			printBooks(bookCol.bookList);
			//Book bookUpdate = new Book(7, "advanced java", "gosling");
			//bookCol.hasBook(bookUpdate);
			System.out.println("after sorting by book title");
			bookCol.sortByBookName();
			

			System.out.println("after sorting by author");
			bookCol.sortByAuthor();
		}
		
		private static void printBooks(List<Book> bookList) {
			for(Book book: bookList) {
				System.out.println(book);
			}

	}

}
