import java.util.Scanner;
class UserInputForPositiveNumbers{
static void askForPositiveNumber(){
Scanner sc = new Scanner(System.in);
int num ;
do{
System.out.println("Enter a Positive Number:");
num = sc.nextInt();
}
while( num <= 0);
System.out.println("You entered a positive number" + num);
}
public static void main(String args[]){
askForPositiveNumber();
}
}
