package fa.training.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book extends Publication {
	private String isbn;
	private Set<String> author;
	private String publicationPlace;

	public Book(String isbn, Set<String> author, String publicationPlace, int publicationYear, String publisher,
			Date publicationDate) {
		super(publicationYear, publisher, publicationDate);
		this.isbn = isbn;
		this.author = author;
		this.publicationPlace = publicationPlace;

	}

	@Override
	public void display() {
		SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Book [isbn=" + isbn + ", author=" + author + ", publicationPlace=" + publicationPlace
				+ ", publicationYear=" + super.getPublicationYear() + ", publisher=" + super.getPublisher()
				+ ", publicationDate=" + SDF.format(super.getPublicationDate()) + "]");

	}

}
