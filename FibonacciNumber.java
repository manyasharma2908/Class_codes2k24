import java.util.*;
public class Main
{
	public static void main(String[] args) {
    int n=5;
    System.out.print(fibo(n));
	}
	public static int fibo(int n){
	    if(n==0 || n==1){
	        return n;
	    }
	    return fibo(n-1)+fibo(n-2);
	}
}
