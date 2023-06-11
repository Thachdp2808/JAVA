package fa.training.services;

import fa.training.entities.Book;
import fa.training.entities.Magazine;
import fa.training.utils.Validate;

public class FunctionRequirement {
	private BookService bookS;
	private MagazineService magazineS;
	
	
	public FunctionRequirement(BookService bookS,MagazineService magazineS) {
		this.bookS=bookS;
		this.magazineS=magazineS;
	}
	
	
	public void showarr(){
		Validate validate = new Validate();
		boolean check;
        if(!magazineS.listMagazine.isEmpty() && !bookS.listBook.isEmpty()){
        	int publicationYear= validate.inputInt("Input PublicationYear: ", 0, 2022,"Out of the range,plz enter in range:(from "+0+" to "+2022+")");
    		String publisher= validate.inputText("Input publisher: ",  "[a-zA-z ]+");
            for(Book book :bookS.listBook){
            	if(book.getPublicationYear() == publicationYear && book.getPublisher().equals(publisher)) {
            		book.display();
            	}else{check=false;}
                
            }
            
            for(Magazine magazine: magazineS.listMagazine) {
            	if(magazine.getPublicationYear() == publicationYear && magazine.getPublisher().equals(publisher)) {
            		magazine.display();
            	}else{check=false;}
            }
        }else{
            System.err.println("List is empty");
        }
        
        if(check=false) {
        	System.err.println("PublicationYear or Pulisher not same");
        }
    }
}
