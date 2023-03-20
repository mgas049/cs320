package MOD3;
import java.util.ArrayList;

public class ContactService {
	//array for the contact list
	private ArrayList<Contact> contacts;
	//default constructor
	public ContactService() {
		contacts = new ArrayList<>();
	}
	//The contact service shall be able to add contacts with a unique ID.
	// method to determine if contact exists
	// and adds it if it doesn't
	public boolean addContact(Contact contact) {
	boolean contactExists = false;
	for (Contact c:contacts) {
		if (c.equals(contact)) {
			contactExists = true;
		}
	}
	if (!contactExists) {
		contacts.add(contact);
		System.out.println("Contact Added.");
		return true;
	}
	else {
		System.out.println("Contact exists");
		return false;
	}
}
	//The contact service shall be able to delete 
	//contacts per contact ID.
	//Method to delete a certain contact ID
	public boolean removeContact(String contactID) {
		for (Contact c:contacts) {
			if (c.getContactID() == contactID) {
				contacts.remove(c);
				System.out.println("Contact Deleted");
				return true;
			}
		}
		System.out.println("Contact doesn't exist");
		return false;
	}
	//The contact service shall be able to update contact fields per contact ID.
	//firstName, lastName, Number and address are updatable
	public boolean updateContact(String contactID, String firstName, String lastName, String phone, String address) {
		for (Contact c:contacts) {
			if (c.getContactID() == contactID) {
				if (!firstName.equals("")) {
					c.setFirstName(firstName);
				}
				if (!lastName.equals("")) {
					c.setLastName(lastName);
				}
				if (!phone.equals("")) {
					c.setPhoneNum(phone);
				}
				if (!address.equals("")) {
					c.setAddress(address);
				}
				System.out.println("Contact Updated");
				return true;
				
			}
		}
		System.out.println("Contact doesn't exist");
		return false;
			
		}
	}

