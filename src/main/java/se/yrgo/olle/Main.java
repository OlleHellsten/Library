package se.yrgo.olle;

public class Main {

	public static void main(String[] args) {

		BookCatalog bookCatalog = new BookCatalog();

		Book book4 = new Book(4,"An introduction to Java","Matt Greencroft","10004","Anytown Branch", 400);
		Book book5 = new Book(5,"Better Java","Joe Le Blanc","10005","Anytown Branch",150);

		bookCatalog.addBook(book4);
		bookCatalog.addBook(book5);

		try {
			Book foundBook = bookCatalog.findBook("Better");
			System.out.println("We found " + foundBook.getTitle());
		}
		catch (BookNotFoundException e) {
			System.out.println("The book wasn't found");
		}

		int myTest = 1;

		try {
			if (myTest != 2) {
				throw new RuntimeException("Something went wrong");
			}
		}
		catch (RuntimeException e) {
			// do nothing here so that we can continue;
		}

		Customer customer = new Customer("Mr", "Michael", "Smith", "1 The High Street","1234","a@b.com",1,GenderType.MALE);
		System.out.println(customer.getExpiryDate());
		System.out.println(customer.getMailingName());

		System.out.println(customer);

		System.out.println(customer.equals(customer));

		Loan firstLoan = new Loan(4,customer,book4);
		System.out.println(firstLoan.getDueDate());
		System.out.println(firstLoan);
		
	}

}
