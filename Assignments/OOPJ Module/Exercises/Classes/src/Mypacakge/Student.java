package Mypacakge;

public class Student {
	
	String name;
	int roll_no;
	String phone_no; 
	String address;

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.roll_no = 2;
		obj.name="John";
		
		
		Student s1 = new Student();
		
		s1.name = "Sam";
		s1.roll_no = 1;
		s1.phone_no = "12345678910";
		s1.address = "Pune";
		
		Student s2 = new Student();
		
		s2.name = "John";
		s2.roll_no = 2;
		s2.phone_no = "123409123";
		s2.address = "Mumbai";
		
		
		System.out.println(s1.name);
		System.out.println(s1.roll_no);
		System.out.println(s1.phone_no);
		System.out.println(s1.address);
		
		System.out.println();
		
		System.out.println(s2.name);
		System.out.println(s2.roll_no);
		System.out.println(s2.phone_no);
		System.out.println(s2.address);
		
	}

}
