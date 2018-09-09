public class leap_year
{
    public static void main(String args[])
	{
		int year=2018;
		if((year%4==0)||(year%400==0)&&(year%100!=0))
		{
			System.out.println("Year is Leap Year");
		}
		else
		{
			System.out.println("Year is Not Leap Year");
		}
	}
}