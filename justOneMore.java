
/*Just One More Episode
Chef has to attend an exam that starts in 
𝑋
X minutes, but of course, watching shows takes priority.

Every episode of the show that Chef is watching, is 
24
24 minutes long.
If he starts watching a new episode now, will he finish watching it strictly before the exam starts?

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of one line of input, containing a single integer 
𝑋
X — the amount of time from now at which Chef's exam starts.*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	    Scanner sc = new Scanner(System.in);
	   
	    int t=sc.nextInt();
	    while(t-->0){
	         int x=sc.nextInt();
	        if(x>24){
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	    }
	    sc.close();

	


	}
}
