package MOD3;
//This is the Module 3 Milestone
//Marc Glass
//3/20/2023

// Contact class
public class Contact {
// initialise class members
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//constructor 
	//The contact object shall have a required unique contact ID string that cannot be longer than 10 characters.
	//The contact ID shall not be null and shall not be updatable.
	public Contact(String contactID, String firstName, String lastName, String phone, String address){
		if (contactID.length() <=10 && contactID != null) {
			this.contactID = contactID;
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	//setters and getters
	public String getContactID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNum() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	//The contact object shall have a required firstName String field that
	// cannot be longer than 10 characters. The firstName field shall not be null.
	public void setFirstName(String firstName) {
		if (firstName.length() <= 10 && firstName != null) {
			this.firstName = firstName;
		}
	}
	//The contact object shall have a required lastName String field 
	//that cannot be longer than 10 characters. The lastName field shall not be null.

	public void setLastName(String lastName) {
		if (lastName.length() <= 10 && lastName != null) {
			this.lastName = lastName;
		}
	}
	//The contact object shall have a required phone String field 
	//that must be exactly 10 digits. The phone field shall not be null.
	public void setPhoneNum(String phone) {
		if (phone.length() == 10 && phone != null) {
			this.phone = phone;
		}
	}
	//The contact object shall have a required address field that 
	//must be no longer than 30 characters. The address field shall not be null.

	public void setAddress(String address) {
		if (address.length() <= 30 && address != null) {
			this.address = address;
		}
	}

	@Override
	public String toString() {
		return "Contact ID: " + contactID + ", First: " + firstName + ", Last: " + lastName + ", Phone: " + phone + ", Address: " + address;
	}	
}
