import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int sum = 0; // Initialize sum here
            while(n > 0) {
                sum += n % 10; // Add the last digit to sum
                n = n / 10; // Remove the last digit from n
            }
            System.out.println(sum); // Print the sum after the loop
        }
    }
}
