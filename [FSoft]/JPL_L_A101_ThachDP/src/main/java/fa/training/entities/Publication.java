package fa.training.entities;

import java.util.Date;

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
public abstract class Publication {
	private int publicationYear;
	private String publisher;
	private Date publicationDate;

	public abstract void display();
}
