class LeapYear{
public static void main (String args[]){
int year1 = 2024;
int year2 = 1900;
if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)){
System.out.println( year1 + " It is a Leap Year");
}else{
System.out.println(year1 + " It is a Not Leap Year");
}
if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)){
System.out.println(year2 + " It is a Leap Year");
}else{
System.out.println(year2 + " It is a Not Leap Year");
}

}
}





