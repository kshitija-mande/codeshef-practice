/*Mana Points
Chef is playing a mobile game. In the game, Chef's character Chefario can perform special attacks. However, one special attack costs 
𝑋
X mana points to Chefario.

If Chefario currently has 
𝑌
Y mana points, determine the maximum number of special attacks he can perform.*/


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
	         int y=sc.nextInt();
	        if(x<=y){
	            int ans= y/x;

	            System.out.println(ans);
	        }   
	        else{
	            System.out.println("0");
	        }

	}


	}	
}
