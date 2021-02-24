
public class Hourly extends Employee {
	
	protected int hoursWorked;
	
	Hourly(String Name, String Address, String Phone,String SS_No, double rate){
		super(Name, Address, Phone, SS_No, rate);
		hoursWorked = 0;
	}

	
	public double pay() {
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nCurrent hours: " + hoursWorked;
		return result;
	}
	
	
	
	
	

}
