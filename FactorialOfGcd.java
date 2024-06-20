import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a=5;
	    int b=5;
	    int ans=fact(Math.min(a,b));
	    System.out.println(ans);
	}
	public static int fact(int ans){
	    if(ans==0){
	        return 1;
	    }
	    return ans*fact(ans-1);
	}
	}
        
