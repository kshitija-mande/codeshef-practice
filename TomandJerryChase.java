/*Tom and Jerry Chase
In a classic chase, Tom is running after Jerry as Jerry has eaten Tom's favourite food.

Jerry is running at a speed of 
𝑋
X metres per second while Tom is chasing him at a speed of 
𝑌
Y metres per second. Determine whether Tom will be able to catch Jerry.

Note that initially Jerry is not at the same position as Tom.*/


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
		if(x>=y){
		    System.out.println("no");
		    
		}
		else{
		    System.out.println("yes");
		}

	}
	}
}
