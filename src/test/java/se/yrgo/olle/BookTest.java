package se.yrgo.olle;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(1, "Dune", "Frank Herbert", "10001", "Central Library", 412);
		Book book2 = new Book(1, "Dune", "Frank Herbert", "10001", "Central Library", 412);

		// testar om böckerna är samma
		assertEquals(book1, book2);
	}

	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1, "Dune", "Frank Herbert", "10001", "Central Library", 412);
		Book book2 = new Book(2, "The Hobbit", "J.R.R. Tolkien", "10002", "Central Library", 310);

		// testar om böckerna är olika
		assertNotEquals(book1, book2);
	}

}
