import java.util.*;
public class FindTheLargestElementInAnArray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] num = new int[5];
System.out.println("Enter 5 intergers:"); 
for(int i = 0; i < 5; i++){
num[i] = sc.nextInt();
}
int largest = Arrays.stream(num).max().getAsInt();
System.out.println("The largest element is:" + largest);
}
}