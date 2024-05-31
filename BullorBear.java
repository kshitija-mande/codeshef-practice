/*Bull or Bear
Chef is on his way to become the new big bull of the stock market but is a bit weak at calculating whether he made a profit or a loss on his deal.

Given that Chef bought the stock at value 
𝑋
X and sold it at value 
𝑌
Y. Help him calculate whether he made a profit, loss, or was it a neutral deal.*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
	   	int x= sc.nextInt();
		int y= sc.nextInt();
		if(x<y){
		    System.out.println("profit");
		    
		}
		else if(x==y){
		    System.out.println("neutral");
		}
		else{
		    System.out.println("loss");
		}

	}

	}
}
