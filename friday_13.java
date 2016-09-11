
import java.util.Scanner;
public class friday_13 {
public final static String months[]={"January","February","March","April","May","June",
							  "July","August","September","October","November","December"};
final static int [] t= {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
	public static void main(String args[])
	{
		
		System.out.println("Friday the 13");
		System.out.println("The program will look up all friday the 13 between two years");
		System.out.println("Enter initial year: ");
		Scanner scan=new Scanner(System.in);
		int year[]=new int[2];
		year[0]=scan.nextInt();
		System.out.println("Enter final year: ");
		year[1]=scan.nextInt();
		Fridays(year);
		
	}
	
	private static int Tomohiko(int year,int month, int day)
	{
		 year -= (month < 3) ? 1:0;
		 return (year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;	
	}
	
	public static void Fridays(int year[])
	{
		for(int i=year[0];i<=year[1];i++)
		{
			for(int j=1;j<13;j++)
				if(Tomohiko(i,j,1)==0)
				{
					System.out.println(months[j-1] +" "+ i +" has a Friday the 13." );
				}
		}
	}
	
}
