package TaskService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TaskTest {
	// initialize class members and test the setters
	Task task = new Task("0", "Name", "Description");
	
	//test the getters
	@Test
	void getTaskID() {
		assertEquals("0", task.getTaskID());
	}
	@Test
	void getName() {
		assertEquals("Name", task.getName());
	}
	@Test
	void getDescription() {
		assertEquals("Description", task.getDescription());
	}
	
	
	
	
	

}
