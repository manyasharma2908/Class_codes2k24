import java.util.*;
public class Main
{
	public static void main(String[] args) {
    boolean[]arr=new boolean[5];
    comb(4,2,0,"",arr);
     	}
     	public static void comb(int cars,int n,int p,String ans,boolean[]arr){
     	    if(n==p){
     	        System.out.println(ans+" ");
     	        return;
     	    }
     	    for(int i=1;i<=4;i++){
     	        if(arr[i]==false){
     	            arr[i]=true;
     	            comb(cars,n,p+1,ans+"c"+i+" "+p,arr);
     	            arr[i]=false;
     	        }
     	    }
     	    
     	}
}
