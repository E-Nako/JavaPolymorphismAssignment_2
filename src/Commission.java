
public class Commission extends Hourly{
	private double totalSaless;
	private double commissionRate;
	
	Commission(String Name, String Address, String Phone,String SS_No,double rate,double commRate){
		super(Name, Address, Phone, SS_No, rate);
		this.commissionRate = commRate;
		
		totalSaless = 0;
	}
	
	public void addSales (double totalSales) {
		totalSaless += totalSales;
	}
	
	public void addHours (int hours) {
		hoursWorked += hours; 
	}

	
	public double pay() {
		double payment = (super.pay() + (totalSaless * commissionRate));
		return payment;
	}
	
	public String toString() {
		String result =  super.toString() + totalSaless;
		return result;
	}
}
