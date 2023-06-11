package fa.training.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import fa.training.entities.Magazine;
import fa.training.utils.Validate;

public class MagazineService {
	Validate validate = new Validate();
	List<Magazine> listMagazine = new ArrayList<>();
	
	public void addMagazine() {
		String author = validate.inputText("Input Author: ", "[a-zA-z ]+");
		int volume = validate.inputInt("Input Volume: ", 0, Integer.MAX_VALUE, "Please input > 0");
		int edition = validate.inputInt("Input Edition: ", 0, Integer.MAX_VALUE, "Please input > 0");
		
		String publisher = validate.inputText("Input Publisher: ", "[a-zA-z ]+");
		Date publicationDate = validate.inputDateTime("Input PublicationDate: ", "dd-MM-yyyy");
		int publicationYear = validate.inputInt("Input PublicationYear: ", 0, 2023,"Out of the range,plz enter in range:(from " + 0 + " to " + 2023 + ")");
		
		listMagazine.add(new Magazine(author,volume,edition,publicationYear,publisher,publicationDate));
	}
	
	public void displayTop1OMagazineByVolunme() {
		if(listMagazine!=null) {
        Collections.sort(listMagazine, (o1, o2) -> Integer.compare(o2.getVolume(), o1.getVolume()));
        for (int i = 0; i < 10; ++i) {
        	listMagazine.get(i).toString();
            System.out.println();
        }
		}else { System.err.println("Magazine not existed");}
    }
	
	public List<Magazine> listMagazine(){
		return listMagazine;
	}
}
