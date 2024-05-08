/*Determine the Score
Chef appeared for a placement test.

There is a problem worth 
𝑋
X points. Chef finds out that the problem has exactly 
10
10 test cases. It is known that each test case is worth the same number of points.

Chef passes 
𝑁
N test cases among them. Determine the score Chef will get.

NOTE: See sample explanation for more clarity.*/



import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y = sc.nextInt();
		    int ans = (x/10)*y;
		    System.out.println(ans);
		}

	}
}
