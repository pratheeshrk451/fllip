package org.company;

public class CompanyInfo {
	public void companyName(String name,int id) {
	
System.out.println("Company name: "+name+"Company Id: "+id);


	}
	public void companyName(String nickname) {
		System.out.println("Short name is: "+nickname);
		
	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName("Tata consultancy service",45565 );
		c.companyName("TCS");
	}
	

}
