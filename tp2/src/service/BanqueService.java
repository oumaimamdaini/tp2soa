package service;

public class BanqueService {
	
	public double conversion(double montant) {
		return montant*3.36; 
	}
	public static void main(String[] args) {
		BanqueService b=new BanqueService();
		double montant=23.5;
		System.out.println(b.conversion(montant));
		
	}

	

}
