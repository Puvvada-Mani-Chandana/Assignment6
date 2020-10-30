package com.asiignment6.question3;

import java.util.Comparator;

class booksOrder implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		return o1.getAuthor().compareTo(o2.getAuthor());
	}
}
public class Book implements Comparable<Book>{
	private int id;
	private String title;
	private String author;
	
	public Book() {}
	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", author=");
		builder.append(author);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int compareTo(Book b) {
		return this.getTitle().compareTo(b.getTitle());
	}
}
