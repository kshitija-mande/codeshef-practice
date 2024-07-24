/*Speciality
On every CodeChef user's profile page, the list of problems that they have set, tested, and written editorials for, is listed at the bottom.

Given the number of problems in each of these 
3
3 categories as 
𝑋
,
𝑌
,
X,Y, and 
𝑍
Z respectively (where all three integers are distinct), find if the user has been most active as a Setter, Tester, or Editorialist.*/




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
		    int x = sc.nextInt();
		     int y = sc.nextInt();
		      int z = sc.nextInt();
		      if(x>y && x>z){
		          System.out.println("setter");
		      }
		      else if(x<y && y>z){
		          System.out.println("tester");
		          
		      }
		      else{
		          System.out.println("editorialist");
		      }
		    
		}

	}
}
