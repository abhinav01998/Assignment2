import java.util.*;

public class palindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b=0,temp,rem;
		a=sc.nextInt();
		temp=a;
		while(temp!=0){
			rem=temp%10;
			b=b*10+rem;
			temp=temp/10;
		}
		if(a==b)
			System.out.println("Number is palindrome");
		else
		    System.out.println("Number is not palindrome");
	}}