
import java.util.Scanner ;

public class Car {
	
	
	Scanner scan=new Scanner (System.in);
	void printCar() {
		System.out.println("Enter the merk of car");
		String merk = scan.next();
		System.out.println("Enter the type  of car");
		String type = scan.next();
		System.out.println("Enter the color of car");
		String color=scan.next();
		
	}
	void maxSpeed() {
		System.out.println ("Enter max speed");
		double speed=scan.nextDouble();
	}
	void totalPrice() {
		System.out.println("How much car you want to buy?");
		int quantity = scan.nextInt();
		System.out.println("Enter the price");
		double money = scan.nextDouble();
		double totalPrice = quantity*money;
		System.out.println("Total price of the car:"+ totalPrice);
	}
		
}
