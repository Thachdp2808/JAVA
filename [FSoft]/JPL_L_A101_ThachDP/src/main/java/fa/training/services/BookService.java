package fa.training.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fa.training.entities.Book;
import fa.training.utils.Validate;

public class BookService {
	Validate validate = new Validate();
	List<Book> listBook = new ArrayList<>();

	public void addBook() {
		Set<String> setAuthor = new HashSet<>();
		String isbn = validate.inputIsBn("Input ISBN: ", listBook);
		int size = validate.inputInt("Input number of authors: ", 1, 10,
				"Out of the range,plz enter in range:(from " + 1 + " to " + 10 + ")");
		setAuthor = validate.setAuthour(size);

		String publicationPlace = validate.inputText("Input PublicationPlace: ", "[a-zA-z ]+");
		String publisher = validate.inputText("Input Publisher: ", "[a-zA-z ]+");
		Date publicationDate = validate.inputDateTime("Input PublicationDate: ", "dd-MM-yyyy");
		int publicationYear = validate.inputInt("Input PublicationYear: ", 0, 2023,"Out of the range,plz enter in range:(from " + 0 + " to " + 2023 + ")");

		Set<String> author = setAuthor;

		Book book = new Book(isbn, author, publicationPlace, publicationYear, publisher, publicationDate);
		System.out.println("Add an task successful");
		listBook.add(book);
	}

	public void addAuthortoBook() {
		if (!listBook.isEmpty()) {
		String isbn = validate.inputIsBn("Input ISBN: ", listBook);
		Book book = validate.bookById(isbn, listBook);
		
		if (book != null) {
			String author = validate.inputText("Input Author: ", "[a-zA-z ]+");
			if (book.getAuthor().equals(author)) {
				System.err.println("Author existed");
			} else {
				book.getAuthor().add(author);
				System.out.println("Add Successfully");
			}
		} else {System.err.println("Book not existed");} 
		}else {System.err.println("List is Empty");}

	}

	 public void searchBookBy(String string,int id) {
		 List<Book> ListBooks = new ArrayList<Book>();
	        for (Book book : listBook) {
	        	 switch (id) {
	                case 1:
	                	if (book.getIsbn().equals(string)) {
			            	ListBooks.add(book);
			            }
	                    break;
	                case 2:
	                	if (book.getAuthor().equals(string)) {
			            	ListBooks.add(book);
			            }
	                    break;
	                case 3:
	                	if (book.getPublisher().equals(string)) {
			            	ListBooks.add(book);
			            }
	                    break;
	            }
	        }
	        Collections.sort(ListBooks, Comparator.comparing(book -> ((Book) book).getIsbn())
	                .thenComparing(book -> ((Book) book).getPublicationDate()));
	        for (Book book : ListBooks) {
                 book.display();
            }
	        
	    }
	 
	 public void searchBook() {
		 if(!listBook.isEmpty()) {
			 int choice;
		        do {
		            System.out.println("Search Book.");
		            System.out.println("1.By isbn: ");
		            System.out.println("2.By author: ");
		            System.out.println("3.By publisher: ");
		            System.out.println("4.Return list manager");
		            choice = validate.inputInt("Please choose function you'd like to do: ", 1, 4,"Out of the range,plz enter in range:(from "+1+" to "+4+")");
		            switch (choice) {
		                case 1:
		                	String isbn= validate.inputText("Input ISBN: ",  "[[0-9]+[-]*]*");
		                	searchBookBy(isbn,1);
		                    break;
		                case 2:
		                	String author= validate.inputText("Input Author: ",  "[a-zA-z ]+");
		                	searchBookBy(author,2);
		                    break;
		                case 3:
		                	String publisher= validate.inputText("Input Publisher: ",  "[a-zA-z ]+");
		                    searchBookBy(publisher,3);
		                    break;
		                case 4:
		                    System.out.println("Exit search Book.");
		                    break;
		            }
		        } while (true);
		 }else {System.err.println("List is Empty");}
	   
	    }

	public List<Book> listBook() {
		return listBook;
	}
}
