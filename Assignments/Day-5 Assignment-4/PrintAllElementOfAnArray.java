import java.util.Scanner;
class PrintAllElementOfAnArray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] num = new int[5];
System.out.println("Enter 5 integers:");
for (int i = 0; i<5; i++){
num[i] = sc.nextInt();
}
for ( int Element : num){
System.out.println(Element);
}
}
}

