class AverageMarks{
public static void main (String args[]){
int Maths = 80;
int Science = 85;
int History = 90;
double avg = (Maths + Science + History) / 3;
System.out.println(avg);
if (avg >= 90)
System.out.println("Grade A");
else if (avg >=70 && avg <= 89)
System.out.println("Grade B");
else if (avg >= 50 && avg <= 69)
System.out.println("Grade C");
else if (avg >= 30 && avg <= 49)
System.out.println("Grade B");
else
System.out.println("Fail");
}
}





