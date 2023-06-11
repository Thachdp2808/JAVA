package fa.training.main;

import fa.training.services.BookService;
import fa.training.services.FunctionRequirement;
import fa.training.services.MagazineService;
import fa.training.utils.Validate;

public class LibraryManagement {
	public static void main(String[] args) {
		BookService bookS = new BookService();
		MagazineService magazineS = new MagazineService();
		Validate validate = new Validate();
		FunctionRequirement show = new FunctionRequirement(bookS, magazineS);
		int choice;
		do {
			validate.menu();
			choice = validate.inputInt("Please choose function you'd like to do: ", 1, Integer.MAX_VALUE,"Please input > 0");
			switch (choice) {
			case 1:
				bookS.addBook();
				break;
			case 2:
				magazineS.addMagazine();
				break;
			case 3:
				show.showarr();
				break;
			case 4:
				bookS.addAuthortoBook();
				break;
			case 5:
				magazineS.displayTop1OMagazineByVolunme();
				break;
			case 6:
				bookS.searchBook();
				break;
			default:
				System.out.println("Exit program");
				System.exit(0);
			}
		} while (true);

	}

}
