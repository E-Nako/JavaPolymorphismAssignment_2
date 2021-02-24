
public class Employee extends StaffMember {
	 protected String socialSecurityNumber;
	 protected double payRate;
	 
	 Employee(String Name, String Address, String Phone,String SS_No,double rate){
		 super(Name,Address,Phone);
		 this.socialSecurityNumber = SS_No;
		 this.payRate = rate;
		 
	 }

	public String toString() {
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber;
		
		return result;
	}
	
	public double pay() {
		return payRate;
	}
	 
}
