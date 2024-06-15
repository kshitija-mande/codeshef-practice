/*Bidding
Alice, Bob and Charlie are bidding for an artifact at an auction.
Alice bids 
𝐴
A rupees, Bob bids 
𝐵
B rupees, and Charlie bids 
𝐶
C rupees (where 
𝐴
A, 
𝐵
B, and 
𝐶
C are distinct).

According to the rules of the auction, the person who bids the highest amount will win the auction.
Determine who will win the auction.*/


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
		        System.out.println("ALICE");
		        
		    }else if(y>x && y>z){
		        System.out.println("BOB");
		    }else{
		        System.out.println("CHARLIE");
		    }
}
	}
}
