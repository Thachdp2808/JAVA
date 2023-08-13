package View;

import BO.TaskManager;
import Model.Task;

public class ViewTaskManager {
	Validation validation = new Validation();
	TaskManager taskManager = new TaskManager();
	public void menu() {
		System.out.println("====Task Program====");
		System.out.println("1.Add task");
		System.out.println("2.Delete task");
		System.out.println("3.Display task");
		System.out.println("4.Exit");
	}

	public void addTask() {
		Task task = inputTask();
		taskManager.getListTask().add(task);
	}
	
	public void deleteTask() {
		int id = validation.InputInt("ID: ", 1, Integer.MAX_VALUE, "Erro");
		if(taskManager.checkIDExit(id)==false) {
			System.err.println("Id must exist in the DB");
			return;
		}
		int check = taskManager.getIndexByID(id);
		taskManager.getListTask().remove(check);
		
	}
	
	public void display() {
		if(taskManager.getListTask().isEmpty()) {
			System.err.println("List is Empty");
			return;
		}
		 System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n",
	                "ID", "Name", "Task Type", "Date", "Time", "Assign", "Reviewer");
		 for(int i =0 ; i<taskManager.getListTask().size();i++) {
			 System.out.println(taskManager.getListTask().get(i).display());
		 }
	}
	

	public Task inputTask() {
		int id = validation.getLastID(taskManager.getListTask())+1;
		String name = validation.InputText("Requirement Name: ", "[a-zA-z ]+");
		int typeid = validation.InputInt("Task Type: ", 1, 4, "Out of the range,plz enter in range:(from " + 1 + " to " + 4 + ")");
		String date = validation.InputDateTimeToadd("Date: ", "dd-MM-yyyy");
		Double from = validation.InputDoubleToadd("From: ", 7.5, 17.0);
		Double to = validation.InputDoubleToadd("To: ", from, 17.5);
		String assign = validation.InputText("Assignee: ", "[a-zA-z ]+");
		String review = validation.InputText("Reviewer: ", "[a-zA-z ]+");
		Task task = new Task(id, name, typeid, date, from, to, assign, review);
		System.out.println("Add an task successful");
		return task;
	}
}
