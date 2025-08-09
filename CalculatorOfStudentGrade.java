import java.util.Scanner;

class MarksOfStudent
{
	int english,maths,science;
	double Avgpercentage;
	int total;
	

	void Acceptmarks()
	{
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter English marks=");
      english=sc.nextInt();
      System.out.println("Enter Maths marks=");
      maths=sc.nextInt();
      System.out.println("Enter Science marks=");
      science=sc.nextInt();
      
	}
	void total()
	{
		total = english+maths+science;
		System.out.println("Total Marks="+total);
	     
	}
	
	void avgper()
	
	{
		Avgpercentage=total/5.0;
		System.out.println("Average Percentage="+Avgpercentage+"%");
		
	}
	
	void grade()
	{
		if(Avgpercentage>=90 && Avgpercentage<=100)
		{
			System.out.println("Grade=O");
		}
		if (Avgpercentage>=80 && Avgpercentage<90)
		{
			System.out.println("Grade=A");
		}
		if(Avgpercentage>=70 && Avgpercentage<80)
		{
			System.out.println("Grade=B");
		}
		if(Avgpercentage>=60 && Avgpercentage<70)
		{
			System.out.println("Grade=C");
		}
		if(Avgpercentage>=50 && Avgpercentage<60)
		{
			System.out.println("Grade=D");
		}
		if(Avgpercentage>=40 && Avgpercentage<50)
		{
			System.out.println("Grade=E");
		}
		if(Avgpercentage<40)
		{
			System.out.println("Student is Fail");
		}
		
	}
	
	
}
public class CalculatorOfStudentGrade
 {

	public static void main(String[] args) 
	{
		MarksOfStudent m=new MarksOfStudent();
		m.Acceptmarks();
		m.total();
		m.avgper();
        m.grade();
	}

}
 

	


