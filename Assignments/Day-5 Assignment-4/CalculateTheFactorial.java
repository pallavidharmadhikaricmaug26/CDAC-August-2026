import java.util.Scanner;

public class CalculateTheFactorial {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number: ");
int N = sc.nextInt();
long F = 1;
for(int i=1 ; i<= N; i++){
F = F*i;
}
System.out.println(F);
}
}


 
