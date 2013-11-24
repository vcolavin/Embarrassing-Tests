package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3,p1.getMaximumBooks());
	}

	public void testSetName() {
		Person p2 = new Person();
		p2.setName("Fred");
		assertEquals("Fred", p2.getName());
	}

	public void testSetMaximumBooks() {
		Person p3 = new Person();
		p3.setMaximumBooks(5);
		assertEquals(5, p3.getMaximumBooks());
	}
	
	public void testToString() {
		Person p4 = new Person();
		p4.setName("Fred");
		p4.setMaximumBooks(7);
		String testString = "Fred (7 books)";
		assertEquals(testString, p4.toString());
	}

}
