package MOD3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	//tests for pass with correct data
	@Test
	public void testAddPass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("1", "Peter", "Parker","9999999999", "20 Ingram St. Queens, NY");
		assertEquals(true, cs.addContact(c1));
	}
	//tests for fail with incorrect data
	@Test
	public void testAddFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("1", "Peter", "Parker","9999999999", "20 Ingram St. Queens, NY");
		assertEquals(true, cs.addContact(c1));
		assertEquals(false, cs.addContact(c1));
	}
	//tests the remove method for pass
	@Test
	public void testRemovePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("1", "Peter", "Parker","9999999999", "20 Ingram St. Queens, NY");
		assertEquals(true, cs.addContact(c1));
		assertEquals(true, cs.removeContact("1"));
	}
	//tests the remove method for fail
	@Test
	public void testRemoveFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("1", "Peter", "Parker","9999999999", "20 Ingram St. Queens, NY");
		assertEquals(true, cs.addContact(c1));
		assertEquals(false, cs.removeContact("2"));
		assertEquals(true, cs.removeContact("1"));
	}
	//test the update method for pass
	@Test
	public void testUpdatePass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("1", "Peter", "Parker","9999999999", "20 Ingram St. Queens, NY");
		assertEquals(true, cs.addContact(c1));
		assertEquals(true, cs.updateContact("1", "Gwen", "Stacy", "0123456789", "Earth-65"));
		
	}
	//test update method for fail
	@Test
	public void testUpdateFail() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("1", "Peter", "Parker","9999999999", "20 Ingram St. Queens, NY");
		assertEquals(true, cs.addContact(c1));
		assertEquals(false, cs.updateContact("2", "Gwen", "Stacy", "1234567890", "Earth-65"));
		
		
	}

}
