import java.util.*;
public class CheckSpecificElement{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Integer[] num = new Integer[5];
System.out.println("Enter 5 integers:");
for(int i = 0; i < 5; i++){
num[i] = sc.nextInt();
}
System.out.println("Enter the element to search for:");
int Element = sc.nextInt();
List<Integer> numList = Arrays.asList(num);
if(numList.contains(Element)){
System.out.println("Found");
}else{
System.out.println("Not Found");
}
}
}
