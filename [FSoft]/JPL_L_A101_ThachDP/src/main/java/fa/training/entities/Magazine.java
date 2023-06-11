package fa.training.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Magazine extends Publication {
	private String author;
	private int volume;
	private int edition;

	public Magazine(String author, int volume, int edition, int publicationYear, String publisher,
			Date publicationDate) {
		super(publicationYear, publisher, publicationDate);
		this.author = author;
		this.volume = volume;
		this.edition = edition;

	}

	@Override
	public void display() {
		SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Magazine [author=" + author + ", volume=" + volume + ", edition=" + edition
				+ ", publicationYear=" + super.getPublicationYear() + ", publisher=" + super.getPublisher()
				+ ", publicationDate=" + SDF.format(super.getPublicationDate()) + "]");

	}

}
