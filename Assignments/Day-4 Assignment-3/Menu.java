import java.util.Scanner;
class Menu{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int choice;
do{
System.out.println(" MENU ");
System.out.println(" 1. Grade Evaluation System");
System.out.println(" 2. Leap Year Check");
System.out.println(" 3. Day of the week");
System.out.println(" 4. Identify Default Values of Variables");
System.out.println(" 5. Exit");
System.out.println("Enter your choice:");
choice = sc.nextInt();

switch(choice){
case 1:
System.out.println("Enter your marks (0-100):");
int marks = sc.nextInt();
if (marks >= 90){
System.out.println("Grade: A");
}
else if (marks >= 75){
System.out.println("Grade: B");
}
else if (marks >= 60){
System.out.println("Grade: c");
}
else if (marks >= 40){
System.out.println("Grade: D");
}
else{
System.out.println("Grade : Fail");
}
break;
case 2:
System.out.println("Enter a year:");
int year = sc.nextInt();
if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)){
System.out.println(year + " It is a Leap year");
}
else {
System.out.println( year + " It is not a Leap year");
}
break;
case 3:
System.out.println("Enter a number (1-7:");
int day = sc.nextInt();
switch (day){
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("Invaild day number");
}
break;
case 4:
System.out.println("byte: " + DataType.a);
System.out.println("short: " + DataType.b);
System.out.println("int: " + DataType.c);
System.out.println("long: " + DataType.d);
System.out.println("float: " + DataType.e);
System.out.println("double: " + DataType.f);
System.out.println("char: " + DataType.g);
System.out.println("boolean: " + DataType.h);
break;
case 5:
System.out.println("Existing");
break;
default:
System.out.println("Invaild choice Please enter 1-5.");
}
}
while(choice != 5);
sc.close();
}
}
class DataType {
static byte a;
static short b;
static int c;
static long d;
static float e;
static double f;
static char g;
static boolean h;
}

