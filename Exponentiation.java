import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   int n=5;
	   int x=2;
	   System.out.println(pow(n,x));
	}
	public static int pow(int n,int x){
	    if(n==0){
	        return 0;
	    }
	    if(x==0){
	        return 1;
	    }
	    if(x%2==0){
	        return pow(n,x/2)*pow(n,x/2);
	    }
	    else{
	        return n*pow(n,x/2)*pow(n,x/2);
	    }
	}
}
