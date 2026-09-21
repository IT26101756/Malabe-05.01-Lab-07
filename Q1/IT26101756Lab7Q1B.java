import java.util.Scanner;
public class IT26101756Lab7Q1B
{
public static void main(String[]args)
{
	Scanner scanner=new Scanner (System.in);
	for(int s=1;s<=3;s++)
	{
		System.out.println("Student"+s);
		System.out.print("Enter marks:");
		double total=0;
		for(int i=0;i<4;i++)
		{
			total+=scanner.nextDouble();
		}
			double average=total/4.0;
			System.out.println("Average is:"+ average);
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
			System.out.println("Overall Grade is"+ grade +"\n");
		}
		scanner.close();
	}
}

