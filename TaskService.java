package TaskService;
import java.util.ArrayList;

public class TaskService {
	//array for the tasks
	private ArrayList<Task> tasks;
	//default constructor 
	public TaskService() {
		tasks = new ArrayList<>();
	}
	//add tasks with unique task ID
	//find task if it exists
	//adds it if it doesn't
	public boolean addTask(Task task) {
		boolean taskExists = false;
	for (Task t:tasks) {
		if (t.equals(task)) {
			taskExists = true;
		}
	}
	if (!taskExists) {
		tasks.add(task);
		System.out.println("Task added.");
		return true;
	}
	else {
		System.out.println("Task already exists.");
		return false;
	}
	}
	//delete tasks per taskID
	public boolean deleteTask(String taskID) {
		for (Task t:tasks) {
			if (t.getTaskID() == taskID) {
				tasks.remove(t);
				System.out.println("Task deleted.");
				return true;
			}
			
		}
		System.out.println("Task doesn't exist");
		return false;
	}
	
	// update the name and description of a task with a given ID
	public boolean updateTask(String taskID, String name, String description) {
		for (Task t:tasks) {
			if (t.getTaskID() == taskID) {
				if (!name.equals("")) {
					t.setName(name);
				}
				if (!description.equals("")) {
					t.setDescription(description);
				}
				System.out.println("Task updated.");
				return true;
				}			
			}
		System.out.println("Task not found");
		return false;
		
		}
	}
	



