
public class Executive extends Employee {
	private double bonus;
	
	Executive(String Name, String Address, String Phone,String SS_No,double rate){
		super(Name,Address,Phone,SS_No,rate);
		
		bonus = 0;
	}

	public void awardBonus (double execBonus) {
		
		bonus = execBonus;
	}
	
	public double pay() {
		double payment = super.pay() + bonus;
		bonus = 0;
		return payment;
	}
	
}
