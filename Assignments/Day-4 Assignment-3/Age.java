
import java.util.Scanner;
class Age{
static void checkAgeCategory(int age){
String user = (age < 18)? " minor " : (age <= 65 ) ? " adult " : " Senior Citizen ";
System.out.println(user);
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Age:");
int age = sc.nextInt();
checkAgeCategory(age);
}
}