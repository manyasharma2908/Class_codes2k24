import java.util.*;
public class Main
{
	public static void main(String[] args) {
    String str="abc";
    perm(str,"");
	}
	public static void perm(String str ,String ans){
	    if(str.length()==0){
	        System.out.print(ans+" ");
	        return;
	    }
	    for(int i=0;i<str.length();i++){
	    char ch=str.charAt(i);
	    String que=(str.substring(0,i)+str.substring(i+1));
	    perm(que,ans+ch);
	}
}
}
