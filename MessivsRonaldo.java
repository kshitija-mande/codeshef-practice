/*Messi vs Ronaldo
In Chefland, a football player gets 
2
2 points for each goal and 
1
1 point for each assist.

Messi has 
𝐴
A goals and 
𝐵
B assists this season, whereas Ronaldo has 
𝑋
X goals and 
𝑌
Y assists.
Find out the player with more points this season.*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc= new Scanner(System.in);
		
	   	int a= sc.nextInt();
		int b= sc.nextInt();
		int x= sc.nextInt();
		int y= sc.nextInt();
		int ans = a*2+b;
		int ans1=x*2+y;
		if(ans>ans1){
		    System.out.println("messi");
		    
		}
		else if(ans==ans1){
		    System.out.println("equal");
		}
		else{
		    System.out.println("ronaldo");
		}

	

	}
}
