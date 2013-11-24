package org.totalbeginner.tutorial;

public class Book {

	String title;
	String author;
	Person person; //person taking the book out

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	//constructor
	public Book(String string) {
		this.title = string;
		this.author = "unknown author";
	}

	public void setPerson(Person p2) {
		this.person = p2;
		
	}

	public Person getPerson() {
		return this.person;
	}

}
