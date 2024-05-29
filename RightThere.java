/*Right There
If you wanna party, if you, if you wanna party
Then put your hands up

Chef wants to host a party with a total of 
𝑁
N people.
However, the party hall has a capacity of 
𝑋
X people. Find whether Chef can host the party.
*/



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
		if(x<=y){
		    System.out.println("yes");
		    
		}
		else{
		    System.out.println("no");
		}

	}

	}
}

