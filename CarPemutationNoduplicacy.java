import java.util.*;
public class Main
{
	public static void main(String[] args) {
    boolean[]arr=new boolean[5];
    comb(4,2,0,"",arr,1);
     	}
     	public static void comb(int cars,int n,int p,String ans,boolean[]arr,int j){
     	    if(n==p){
     	        System.out.println(ans+" ");
     	        return;
     	    }
     	    for(int i=j;i<=4;i++){         //for no duplicacy we introduce j
     	        if(arr[i]==false){
     	            arr[i]=true;
     	            comb(cars,n,p+1,ans+"c"+i+" "+p,arr,i+1);
     	            arr[i]=false;
     	        }
     	    }
     	    
     	}
}
