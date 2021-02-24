
public class Staff {

	StaffMember[] staffList;
	
	public Staff () {
		staffList = new StaffMember[8];
	    staffList[0] = new Executive ("Bosiako Antwi", "Oduro's Street","0244986543", "F0965659", 950.80);
	    staffList[1] = new Employee ("Dela Kwame", "Ayi Mensa","0248976345", "F0567589",200.50);
	    staffList[2] = new Employee ("Sarpong Wendy", "Opp. Eben Plaza","0242462890", "F0876543",350.95);
	    staffList[3] = new Hourly ("Antwi Mary", "Oduro's Street","0244986543", "F0987659", 20);
	    staffList[4] = new Volunteer ("Ibrahim Abiba", "Otinibi Junction","0597869854");
	    staffList[5] = new Volunteer ("Hagan Doreen", "Baron Street", "0500100065");
	    staffList[6] = new Commission("Oppong Mina","Oyibi 324","0279316578","F0786542",6.25,0.20);
	    staffList[7] = new Commission("Naa Keziah","Barnies Street","059876324","F0657542",9.75,0.15);
	    
	    ((Commission)staffList[6]).addSales (400);
	    ((Commission)staffList[6]).addSales (950);
	    
	    ((Commission)staffList[6]).addHours(35);
	    ((Commission)staffList[7]).addHours(40);
	}
  
public void payday () {
	double amount;
	
	 for (int i=0; i < staffList.length; i++) {
		 
		 System.out.println (staffList[i]);

         amount = staffList[i].pay();
         
         if (amount == 0.0) {
        	 System.out.println ("Thanks!");
        	 
        	 System.out.println ("--------------");
         }
         else {
        	 System.out.println ("Paid: " + amount);
        	 
        	 System.out.println ("--------------");
         }
         
	 }
  }
}
