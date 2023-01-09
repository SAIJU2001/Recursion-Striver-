//Reverse an Array using Recursion

import java.util.*;

public class ReverseArrayUsingRecursion
{
    public static void main( String args[] )
    {
        //for input scanner class is used
        Scanner Sc = new Scanner( System.in );
        int t = Sc.nextInt();
        while( t-->0 )
        {
            //the length of the array
            int n = Sc.nextInt();

            //initialize the arra
            int arr[] = new int[n];

            //input the array element
            for( int i=0 ; i<n ; i++ )
                arr[i] = Sc.nextInt();

            //call the method from the solution class
            Solution sl = new Solution();
            sl.reverseRecursion( arr , 0 , n-1 );

            //printing the reverse array element
            for( int i=0 ; i<n ; i++ )
                System.out.print(arr[i]+" ");
        }
    }
} 

class Solution
{
    void reverseRecursion( int arr[] , int l , int r )
    {
        //base case
        if( l>=r )
            return;

        //swaping perform
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

        //recursive call
        reverseRecursion( arr , l+1 , r-1 );
    }
}