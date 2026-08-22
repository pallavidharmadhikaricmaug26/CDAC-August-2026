import java.util.*;
public class StringCreationNewKeyword{
public static void main(String args[]){
String str1 = new String("hello"); 
String str2 = new String("hello"); 
boolean sameObj1 = (str1 == str2);
Boolean sameObj2 = (str1.equals(str2));
System.out.println(" using ==" +sameObj1);
System.out.println(" Using .equals():" + sameObj2);

}
}
