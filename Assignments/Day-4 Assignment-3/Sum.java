import java.util.Scanner;
class Sum{
int sumOfTwoNumbers(int a, int b){
int sum = a + b;
return sum;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number:");
int a = sc.nextInt();
System.out.println("Enter second number:");
int b = sc.nextInt();
Sum add  = new Sum();
int result = add.sumOfTwoNumbers(a , b);
System.out.println("The sum of " + a + " and " + b + " is " + result);
}
}
