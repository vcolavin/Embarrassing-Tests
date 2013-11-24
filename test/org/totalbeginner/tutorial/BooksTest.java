package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class BooksTest extends TestCase {
	
	public void testBook() {
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.author);
	}
	
	public void testGetPerson() {
		Book b2 = new Book("War and Peace");
		Person p2 = new Person();
		p2.setName("Elvis");
		
		//say who book is loaned to
		b2.setPerson(p2);
		
		//get name of person who book is loaned to
		String testName = b2.getPerson().getName();
		
		assertEquals("Elvis", testName);
	}
	
}
