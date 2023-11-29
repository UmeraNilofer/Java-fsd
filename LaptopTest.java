package mypackage;

public class LaptopTest {

public static void main(String[] args) {
		
		Laptop c=new Laptop();
		c.setLaptop(18, 56000, "Grey");
		c.display("Dell");
		
		Laptop asus=new Laptop();                 //Default Constructor
		asus.display("Asus");
		
		Laptop hp=new Laptop(39, 72000,"Blue");    //Parameter Constructor
		hp.display("HP");
    }
}
