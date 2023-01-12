//factorial using recursion

import java.util.*;

public class FactorialUsingRecursion

{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        System.out.print( factorial( num ) );
    }
    public static int factorial( int num )
    {
        //base case
        if( num==1 )
            return 1;

        //using functional Recursion
        return num*factorial( num-1 );
    }
}