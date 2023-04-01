package TaskService;
//This is the mod 4 milestone 
//Author: Marc Glass
//4-1-2023
public class Task {
	//private class memebers
	private String taskID;
	private String name;
	private String description;
	
	//public constructor that accepts 3 String param
	public Task(String taskID, String name, String description) {
		this.setTaskID(taskID);
		this.setName(name);
		this.setDescription(description);
	}
	//setters and getters
	public String getTaskID() {
		return taskID;
	}
	// Task ID cannot be > 10 characters , shall not be null
	public void setTaskID(String taskID) {
		if (taskID.length() <= 10 && taskID != null) {
			this.taskID = taskID;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.length() <= 20 && name != null) {
			this.name = name;
		}
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		if (description.length() <= 50 && description != null) {
			this.description = description;
		}
	}
	@Override
	public String toString() {
		return "Task ID: " + taskID + ", Name: " + name + ", Description: " + description;
	}
	
	

}
