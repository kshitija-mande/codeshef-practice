import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		boolean flag = false;
		int [] arr = new int[n];
		for(int i = 0 ; i<n ; i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]==x){
		        flag = true;
		        break;
		    }
		}
	
		if(flag){
		        System.out.println("yes");
		    }else{
		      System.out.println("no");
		
		}
	}
}

