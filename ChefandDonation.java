/*Chef and Donation
In a certain month, Chef earned 
𝑋
X rupees while Chefina earned 
𝑌
Y rupees such that 
𝑌
>
𝑋
Y>X.
Since they want to end up with exactly the same amount, they decide to donate the difference between their income to a charity.

Find the amount they donate in the month.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of two space-separated integers 
𝑋
X and 
𝑌
Y — the income of Chef and Chefina in a month, respectively.*/

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
		if(y>x){
		    System.out.println(y-x);
		    
		}
		

	}

	}
}
