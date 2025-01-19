package se.yrgo.olle;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookCatalogTest {

	private final BookCatalog bc;

	public BookCatalogTest() {
		bc = new BookCatalog();

		Book book1 = new Book(1, "Dune", "Frank Herbert", "10001", "Central Library", 412);
		Book book2 = new Book(2, "The Hobbit", "J.R.R. Tolkien", "10002", "Central Library", 310);

		bc.addBook(book1);
		bc.addBook(book2);

	}

	// G
	@Test
	public void testAddBook() throws BookNotFoundException {
		Book book3 = new Book(3, "Foundation", "Isaac Asimov", "10003", "City Library", 244);
		bc.addBook(book3);

		assertEquals(book3, bc.findBook("Foundation"));
	}

	// G
	@Test
	public void testFindBook() throws BookNotFoundException {
		String title = "Dune";
		Book foundBook = bc.findBook(title);

		assertNotNull(foundBook);
		assertEquals("Dune", foundBook.getTitle());
	}

	// G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
		String title = "dune"; // testar att findBook löser lite små bokstäver
		Book foundBook = bc.findBook(title);

		assertNotNull(foundBook);
		assertEquals("Dune", foundBook.getTitle());
	}

	// G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		String title = "   Dune    ";
		Book foundBook = bc.findBook(title.trim()); // testar att findBook löser lite mellanslag

		assertNotNull(foundBook);
		assertEquals("Dune", foundBook.getTitle());
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}
}

