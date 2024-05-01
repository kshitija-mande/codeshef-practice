/*Chef classifies a day to be either rainy, cloudy, or clear.

In a particular week, Chef finds 
𝑋
X days to be rainy and 
𝑌
Y days to be cloudy.
Find the number of clear days in the week.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
         Scanner sc =new Scanner(System.in);
        
       
       
        
            int x=sc.nextInt();
            int y=sc.nextInt();
             int ans = 7 - x - y;
            System.out.println(ans);
    }     
}
