//sum of first n number using parameterized Recursion

import java.util.*;

public class ParameterizedRecursion
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        System.out.print( printRecursion( 0 , num ) );
    }
    public static int printRecursion( int sum ,int num )
    {
        if( num==0 )
            return sum;
        
        sum+=num;
        return printRecursion( sum , num-1 );
    }
}