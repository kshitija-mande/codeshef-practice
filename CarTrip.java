/*Car Trip
Chef rented a car for a day.

Usually, the cost of the car is Rs 
10
10 per km. However, since Chef has booked the car for the whole day, he needs to pay for at least 
300
300 kms even if the car runs less than 
300
300 kms.

If the car ran 
𝑋
X kms, determine the cost Chef needs to pay.*/

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
		    if(x>300){
		    int ans = x*10;
		    System.out.println(ans);
		    }
		    else{
		       int ans= 300*10;
		        System.out.println(ans);
		    }
	}

	}
}
