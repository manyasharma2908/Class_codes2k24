import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(hcf(a,b));
	}
	public static int hcf(int a,int b){
	   while(a>0 && b>0){
	       if(a>b){
	           a=a%b;
	       }
	       else{
	           b=b%a;
	       }
	   }
	   return a+b;  
	}
}
