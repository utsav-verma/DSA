import java.util.*;
/* a^3 + b^3 = n , find all pair statisfying the condition,a>=1 & b>=0*/
/* Approach would be to traverse through number from 0 to n/2 ,
as we have to find pair so n/2 
now subtract n - b^3 to find a^3 and increase count ++
the loop will run till n > b^3*/


public class find_pair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int count =pair(n,0);
        System.out.println(count);
    }
    public static int pair(int n,int b)
    {
        int z =(int)Math.pow(b,3);
        if(z>=n)
        {
            return 0;
        }
        int  y = n-z;
       
        if(iscube(y))// to check for perfect cube
        {
            return 1+pair(n,b+1);
        }

        return pair(n,b+1);
    }
    public static boolean iscube(int y)
    {
        double pow = (double)(1.0/3.0);//power
        
        int j = (int)Math.round(Math.pow(y,pow));
        if(y==(j*j*j))
        return true;
        return false;
    }
    
}
//Time complexity will be o(n^(1/3))
