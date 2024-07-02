/*Couple Game
There are 
𝐺
G girl and 
𝐵
B boy students at IIT (BHU) such that 
𝐵
>
𝐺
B>G.

If ICM were a team game where teams could only be of size 
2
2, having exactly 
1
1 girl student and 
1
1 boy student, what would be the minimum number of boy students from IIT (BHU) who would not be able to participate?*/


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
		    int G = sc.nextInt();
		    int B = sc.nextInt();
		    
		   
		        int ans = B-G;
		        
		   
		        System.out.println(ans);
	

	}
	}
}


