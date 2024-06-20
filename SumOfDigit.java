import java.util.*;
public class Main
{
    static int count=0;
	public static void main(String[] args) {
		int n=123;
		System.out.println(print(n));
	}
	public static int print(int n){
	    if(n==0){
	        return 0;
	    }
	    return n%10+print(n/10);
	}
}
		   
		   
		   
		   
		   
	
