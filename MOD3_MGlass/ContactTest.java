package MOD3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	//class member
	Contact contact = new Contact("0","First", "Last", "1111111111", "street");
	
	// testing all of the getters
	@Test
	void getContactID() {
		assertEquals("0", contact.getContactID());
	}
	@Test
	void getFirstName() {
		assertEquals("First", contact.getFirstName());
	}
	@Test
	void getLastName() {
		assertEquals("Last", contact.getLastName());
	}
	@Test
	void getPhone() {
		assertEquals("1111111111", contact.getPhoneNum());
		
	}
	@Test
	void getAddress() {
		assertEquals("street", contact.getAddress());
	}
	//test the "toString" method 
	@Test
	void testToString() {
		assertEquals("Contact ID: 0, First: First, Last: Last, Phone: 1111111111, Address: street", contact.toString());
	}

}
