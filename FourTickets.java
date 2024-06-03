/*Four Tickets
Four friends want to attend a concert. Each ticket costs 
𝑋
X rupees.
They have decided to go to the concert if and only if the total cost of the tickets does not exceed 
1000
1000 rupees.

Determine whether they will be going to the concert or not.*/

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
	   	int ans = x*4;
		
		if(ans<=1000){
		    System.out.println("yes");
		    
		}
		else{
		    System.out.println("no");
		}

	}

	}
}
