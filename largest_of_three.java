public class largest_of_three{
	public static void main(String args[]){
		int a=15,b=5,c=10;
		if(a>b){
			if(a>=c){
				System.out.println("Max is: a and its value is: "+a);
			}
			else{
				System.out.println("Max is: c and its value is: "+c);
			}}
		else if(b>a) {
			if(b>=c) {
				System.out.println("Max is: b and its value is: "+b);
			}
			else{
				System.out.println("Max is: c and its value is: "+c);
			}
		}}}