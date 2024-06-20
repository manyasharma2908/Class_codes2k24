import java.util.*;
public class Main
{
	public static void main(String[] args) {
    String str="abcd";
    print(str,"");
	}
	public static void print(String str,String ans){
	    if(str.length()==0){
	        System.out.print(ans+" ");
	        return;
	    }
	    print(str.substring(1),ans+"");
	    print(str.substring(1),ans+str.charAt(0));
	}
}


