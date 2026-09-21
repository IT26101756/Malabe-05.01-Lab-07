import java.util.Scanner;
public class IT26101756Lab7Q1A
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		double total=0;
		System.out.println("Enter marks for four subjects:");
		for(int i=1;i<=4;i++)
		{
			System.out.print("enter subject mark" + i +":");
			double mark=scanner.nextDouble();
			total +=mark;
		}
		double average=total/4.0;
		System.out.println("\naverage is:"+average);
		String grade;
		if(average>=75)
		{
			grade="Distinction";
		}
		else if(average>=50)
		{
			grade="credit";
		}
		else{
			grade="fail";
		}
		System.out.println("overall grade is:"+grade);
		scanner.close();
	}
}
