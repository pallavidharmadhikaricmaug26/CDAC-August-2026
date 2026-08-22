import java.util.*;
public class CountPositiveAndNegativeNumbers{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] num = new int[6];
System.out.println("Enter 6 integers:");
for( int i= 0; i<6; i++){
num[i] = sc.nextInt();
}
int positiveCount = 0;
int negativeCount = 0;
for(int i = 0; i < 6; i++){
if(num[i] > 0){
positiveCount++;
}
else if (num[i] < 0){
negativeCount++;
}
}
System.out.println("Positive Numbers:" + positiveCount);
System.out.println("Negative Numbers:" + negativeCount);
}
}