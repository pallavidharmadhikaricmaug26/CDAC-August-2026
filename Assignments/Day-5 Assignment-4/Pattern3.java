import java.util.*;
public class Pattern3{
public static void main(String args[]){
int  n = 5;
for(int i = 1; i <= n; i++){
for(int j = 1; j <=(2*i-1); j += 2){
System.out.print(j);
if (j < (2*i-1)) {
System.out.print("*");
}
}
System.out.println();
}
}
}