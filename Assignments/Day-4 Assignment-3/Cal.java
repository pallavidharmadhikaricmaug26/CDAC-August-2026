import java.util.Scanner;
class Cal{
static int calculateSum(int N){
int sum = 0;
for( int i = 1; i<=N; i++){
sum = sum + i;
}
return sum;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int N = sc.nextInt();
int output = calculateSum(N);
System.out.println("The sum of numbers fron 1 to " + N + " is: " + output);
}
}


