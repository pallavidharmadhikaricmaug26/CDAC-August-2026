import java.util.*;
public class FindTheAverageOfElementsInAArray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] Avg = new int[5];
System.out.println("Enter 5 integers:");
for(int i=0; i<5; i++){
Avg[i] = sc.nextInt();
}
double Average = Arrays.stream(Avg).average().getAsDouble();
System.out.println("The Average of Elements is:" + Average);
}
}
