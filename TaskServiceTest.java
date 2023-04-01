package TaskService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TaskServiceTest {
	// tests for correct data
	@Test
	public void testAddPass() {
		TaskService ts = new TaskService();
		Task t1 = new Task("1", "Laundry", "Fold the clean clothes");
		assertEquals(true, ts.addTask(t1));
	}
	// tests for fail with incorrect data
	@Test
	public void testAddFail() {
		TaskService ts = new TaskService();
		Task t1 = new Task("1", "Laundry", "Fold the clean clothes");
		assertEquals(true, ts.addTask(t1));
		assertEquals(false, ts.addTask(t1));
	}
	//test for successful delete
	@Test 
	public void testRemovePass() {
		TaskService ts = new TaskService();
		Task t1 = new Task("1", "Laundry", "Fold the clean clothes");
		assertEquals(true, ts.addTask(t1));
		assertEquals(true, ts.deleteTask("1"));
	}
	//test for deletion failure
	public void testRemoveFail() {
		TaskService ts = new TaskService();
		Task t1 = new Task("1", "Laundry", "Fold the clean clothes");
		assertEquals(true, ts.addTask(t1));
		assertEquals(false, ts.deleteTask("2"));
		assertEquals(true, ts.deleteTask("1"));
	}
	//test update method for pass
	@Test
	public void testUpdatePass() {
		TaskService ts = new TaskService();
		Task t1 = new Task("1", "Laundry", "Fold the clean clothes");
		assertEquals(true, ts.addTask(t1));
		assertEquals(true, ts.updateTask("1", "Dishes", "Wash the dishes"));
		// FIX ME: something is not working here
	}
	
	//test the update method for fail
	public void testUpdateFail() {
		TaskService ts = new TaskService();
		Task t1 = new Task("1", "Laundry", "Fold the clean clothes");
		assertEquals(true, ts.addTask(t1));
		assertEquals(false, ts.updateTask("2", "Dishes", "Wash the dishes"));

	}

}
