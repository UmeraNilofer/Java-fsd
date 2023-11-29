package mypackage;

public class Laptop {

	int quantity;
	float price;
	String colour;

	void setLaptop(int quantity,float price,String colour) {
		this.quantity=quantity;
		this.price=price;
		this.colour=colour;
	}
	
	void display(String model) {
		String msg="Laptop Info";
		System.out.println(msg+":"+model);
		System.out.println("Quantity:"+ quantity);
		System.out.println("Price:"+ price);
		System.out.println("Colour:"+ colour);
	}

	public Laptop() {			//Default Constructor
		System.out.println("object created...");
		this.quantity = 25;
		this.price = 63000;
		this.colour = "Black";
	}

	public Laptop(int quantity, float price, String colour) {	//Parameterized Constructor
		super();
		System.out.println("object created...");
		this.quantity = quantity;
		this.price = price;
		this.colour = colour;
	}
}
