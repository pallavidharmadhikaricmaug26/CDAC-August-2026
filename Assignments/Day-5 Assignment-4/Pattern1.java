import java.util.*;
public class Pattern1 {
public static void main(String args[]) {
int n = 5;
for (int i = 1; i <= n; i++) {
printRow(i);
}
for (int i = n; i >= 2; i--) {
printRow(i);
}
}
static void printRow(int i) {
for (int j = 1; j <= i; j++) {
System.out.print(i);
if (j < i) {
System.out.print("*");
}
}
System.out.println();
}
}