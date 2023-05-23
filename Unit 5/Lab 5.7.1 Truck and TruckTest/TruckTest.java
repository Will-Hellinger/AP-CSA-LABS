public class TruckTest {

	public static void main(String[] args) 
	{
		System.out.println("********** Phase #1 **********");

		Truck t1 = new Truck();
		t1.setID("123ABC");

		Truck t2 = new Truck("456DEF", 45500, 18, 10);
		
		System.out.println(t1);
		System.out.print(t2);

		System.out.println("********** Phase #2 **********");
		System.out.println(t1);
		
		System.out.println(t1.fill());
		t1.setMPG(15);
		System.out.println(t1);

		System.out.println(t1.drive(150));
		System.out.println(t1);

		System.out.println(t1.drive(60));
		System.out.println(t1);

		System.out.println("********** Phase #3 **********");
		System.out.println(t2);
		System.out.println(t2.drive(500));

		System.out.println(t2.fill(30));
		System.out.println(t2.fill(8));

		System.out.println(t2.drive(300));

		System.out.println(t2);
		System.out.println(t2.getTotalFuel());
	}
}
