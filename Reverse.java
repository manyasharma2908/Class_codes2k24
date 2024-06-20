import java.util.*;
public class Main{
public static void main(String[] args) {
int n=10;
System.out.println(print(n));
	}
public static int print(int n){
    if(n==1){
 	        return 1;
 	    }
 	  System.out.print(n+" ");
 	    return print(n-1);
 	}
 }
