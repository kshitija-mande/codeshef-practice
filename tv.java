import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int d = sc.nextInt();
	        
	        int discount1 = a-c;
	        int discount2 = b-d;
	        
	        if(discount1>discount2){
	            System.out.println("second");
	        }
	        else if (a-c ==b-d){
	            System.out.println("any");
	        }
	        else{
	            System.out.println("first");
	        }
	    }

	}
}
