//sum of first n number using parameterized Recursion

import java.util.*;

public class FunctionalRecursion
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        System.out.print( printRecursion( num ));
    }
    public static int printRecursion( int num )
    {
        if( num==0 )
            return 0;

        return num + printRecursion( num-1 );
    }
}