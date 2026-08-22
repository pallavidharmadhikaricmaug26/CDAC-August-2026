import java.util.*;
public class IndexOfElement{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] num = new int[5];
System.out.println("Enter 5 integers:");
for(int i = 0; i < 5; i++){
num[i] = sc.nextInt();
}
Arrays.sort(num);
System.out.println("Enter the element to search for:");
int element = sc.nextInt();
int index  = Arrays.binarySearch(num , element);
if(index >= 0){
System.out.println("The number" + element + " is found at index " + index);
}else{
System.out.println("Not Found");
}
}
}
