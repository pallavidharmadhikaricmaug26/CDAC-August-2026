package Mypacakge;

public class Complex {
	
	int real;
	int imag;
	
	 public Complex add(Complex c) {
		 Complex result = new Complex();
		 
		 result.real = real + c.real;
		 result.imag = imag + c.imag;
		 
		 return result;
	 }
	 
	 public Complex subtract(Complex c) {
		 Complex result = new Complex();

	        result.real = real - c.real;
	        result.imag = imag - c.imag;
	        
	        return result;
	 }
	 
	 public Complex multiply(Complex c) {
		 Complex result = new Complex();
		 
		 result.real = (real * c.real) - (imag * c.imag);
		 result.imag = (real * c.imag) + (imag * c.real);
		 
		 return result;
		 }
	 
	 public void display() {
		 System.out.println(real + " + " + imag + "i");
		 }
	
	public static void main(String[] args) {
		
		Complex c1 = new Complex();
        c1.real = 3;
        c1.imag = 2;

        Complex c2 = new Complex();
        c2.real = 4;
        c2.imag = 5;

        Complex sum = c1.add(c2);
        System.out.print("Addition = ");
        sum.display();

        Complex difference = c1.subtract(c2);
        System.out.print("Subtraction = ");
        difference.display();

        Complex product = c1.multiply(c2);
        System.out.print("Multiplication = ");
        product.display();
    }

	}


