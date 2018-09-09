import java.util.*;

public class reverse{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a,b=0,rem;
		a=sc.nextInt();
		while(a!=0){
			rem=a%10;
			b=b*10+rem;
			a=a/10;
		}
		System.out.println("b is: "+b);
	}}