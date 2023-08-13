package View;

public class Main {
	public static void main(String[] args) {
		Validation validation = new Validation();
		ViewTaskManager view = new ViewTaskManager();
		while (true) {
			view.menu();
			int choice = validation.InputInt("Input your choice: ", 1, 5,
					"Out of the range,plz enter in range:(from " + 1 + " to " + 5 + ")");
			switch (choice) {
			case 1:
				view.addTask();
				break;
			case 2:
				view.deleteTask();
				break;
			case 3:
				view.display();
				break;
			case 4:
				System.exit(0);
				break;
			}
		}

	}
}
