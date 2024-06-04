/*Chairs Requirement
Chef's coding class is very famous in Chefland.

This year 
𝑋
X students joined his class and each student will require one chair to sit on. Chef already has 
𝑌
Y chairs in his class. Determine the minimum number of new chairs Chef must buy so that every student is able to get one chair to sit on.*/


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
		int ans = x-y;
		if(ans<0){
		    System.out.println("0");
		}else{
		System.out.println(ans);
		}

	}

	}
}
