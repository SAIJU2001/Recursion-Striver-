//check if a string palindrome or not using Recursion

import java.util.*;

public class CheckPalindromeStringUsingRecursion
{
    public static void main( String args[] )
    {
        //for input scanner class is used
        Scanner Sc = new Scanner( System.in );
        int t = Sc.nextInt();
        while( t-->0 )
        {
            //input the string
            String str = Sc.next();

            //call the method from the solution class
            Solution sl = new Solution();
            boolean ans = sl.checkPalindrome( str , 0 , str.length()-1 );

            if( ans==true )
                System.out.print("The string is palindrome");
            else
                System.out.print("The string is not palindrome");
        }
    }
} 

class Solution
{
    boolean checkPalindrome( String str , int l , int r )
    {
        //base case
        if( l>=r )
            return true;

        //checking equality
        if( str.charAt(l)!=( str.charAt(r) ) )
            return false;
        //recursive call
        return checkPalindrome( str , l+1 , r-1 );
    }
}