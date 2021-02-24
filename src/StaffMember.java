
public abstract class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember (String Name, String Address, String Phone) {
		this.name = Name;
		this.address = Address;
		this.phone = Phone;
	}
	
	
	public String toString() {
		String result = "Name: " + name + "\n";
		result += "Address: " + address + "\n";
		result += "Phone: " + phone;
		
		return result;
	}
	
	public abstract double pay();
}
