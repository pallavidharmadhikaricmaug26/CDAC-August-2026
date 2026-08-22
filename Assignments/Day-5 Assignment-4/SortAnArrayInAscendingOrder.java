import java.util.*;
public class SortAnArrayInAscendingOrder{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] num = new int[6];
System.out.println("Enter 6 integer:");
for(int i = 0; i < 6; i++){
num[i] = sc.nextInt();
}
Arrays.sort(num);
System.out.println("The Ascending order is:" + Arrays.toString(num));
}
}