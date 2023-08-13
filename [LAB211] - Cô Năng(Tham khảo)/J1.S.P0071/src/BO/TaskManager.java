package BO;

import java.util.ArrayList;
import java.util.List;

import Model.Task;

public class TaskManager {
	private List<Task> listTask = new ArrayList<>();
	
	public List<Task> getListTask() {
		return listTask;
	}
	
	public boolean checkIDExit(int id) {
		for(int i =0;i<listTask.size();i++) {
			if(id == listTask.get(i).getId()) {
				return true;
			}
		}
		return false;
	}
	
	 public int getIndexByID(int id) {
	        for (int i = 0; i < listTask.size(); i++) {
	            if (listTask.get(i).getId() == id) {
	                return i;
	            }
	        }
	        return -1;
	    }
}
