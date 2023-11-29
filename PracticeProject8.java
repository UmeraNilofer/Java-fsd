package com;

public class PracticeProject8 {
		
		public static void main(String[] args) {
			Bike b=new Bike();
			b.display();
			Scooty s=new Scooty();
			s.display();
			System.out.println(s.sum(4,5));
			System.out.println(s.sum(4.5,6.5));		//polymorphism
			
		}
	}
		class Bike{
			public void display() {
				System.out.println("Bike");
			}
		}
		
		class Scooty extends Bike {					//inheritance
			@Override
			public void display() {
				System.out.println("Scooty");
			}

		public int sum(int x,int y) {
			return x+y;
		}
		
		public double sum(double x,double y) {			//overload
			return x+y;
		}
		
		
 }	

