import java.util.*;
public class currencyConverter {
	public static void main(String[]args) {
		double usdConvertRate =0.012;
	    double euroConvertRate = 0.011;
	    double japaneesConvertRate = 1.80;
	    double chinaConvertRate =  0.087;
	System.out.println("Welcome to Currency Converter");
	System.out.println("Enter the currency in rupees to convert");	
	System.out.println("Enter the Rupees: ");
	Scanner sc = new Scanner(System.in);
	double r =  sc.nextDouble();
	System.out.println("Select the country to convert from Rupees");
	System.out.println("1.USA");
	System.out.println("2.Europe");
	System.out.println("3.Japan");
	System.out.println("4.China");
	System.out.println("Enter the number of country: ");
	int choice = sc.nextInt();
	if(choice == 1) {
		System.out.println("Rupees "+r+" is equal to = "+0.012*r+" dollor");
		
		
	}else if(choice == 2){
		System.out.println("Rupees "+r+" is equal to = "+0.011*r+" euro");
		
	}else if(choice == 3) {
		System.out.println("Rupees "+r+" is equal to = "+1.80*r+" yen");
		
	}else {
		System.out.println("Rupees "+r+" is equal to = "+0.087*r+" yuan");
	}
	
	}
	
}
