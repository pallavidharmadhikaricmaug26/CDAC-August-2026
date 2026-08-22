import java.util.*;
public class StringLiteralObjectCreation{
public static void main (String args[]){
String str1 = " hello";
String str2 = " hello";
Boolean sameObj = (str1 == str2);
System.out.println("Both variable point to the object:" + sameObj);
}
}
