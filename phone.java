import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x<y){
		        System.out.println("REPAIR");
		        
		    }
		    else if(x==y){
		        System.out.println("ANY");
		    }
		    else{
		        System.out.println("NEW PHONE");
		    }
		}

	}
}
