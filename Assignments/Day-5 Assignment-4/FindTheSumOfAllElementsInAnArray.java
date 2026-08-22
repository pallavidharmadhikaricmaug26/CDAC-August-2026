import java.util.Scanner;
public class FindTheSumOfAllElementsInAnArray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String[] name = new String[4];
System.out.println("Enter 4 names:");
for(int i = 0; i<4; i++){
name[i] = sc.next();
}
for(String Names : name){
System.out.println(Names);
}
}
}


