package training;

public class Main {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		char myChar = 'D';
		String myString = "Hey";
		int myInt = 323;
		double myDouble = 12.3;
		
		//System.out.printf("%b", myBoolean);
		//System.out.printf("%s", myString);
		
		//System.out.printf("%-10s Bro", myString);
		
		//System.out.printf("%.2f", myDouble);
		
		Car myCar = new Car("Ford","Mustang",1969);
		Car myCar2 = new Car("Audi","RS",2019);
		
		System.out.println(myCar.getProducer());
		System.out.println(myCar.getModel());
		
		myCar.setYear(2020);
		System.out.println(myCar.getYear());
		
		myCar.drive();
		myCar2.drive();

	}

}
