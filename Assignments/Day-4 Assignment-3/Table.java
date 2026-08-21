import java.util.Scanner;
class Table{
static void printMultiplicationTable(int n){
for(int i=1; i<=10; i++){
System.out.println( n + " x " + i + " = " + (n*i));
}
}
public static void main(String args []){
Scanner sc = new Scanner(System.in);
System.out.println(" Enter a number:");
int num = sc.nextInt();
sc.close();
 System.out.println();
printMultiplicationTable(num);
}
}
