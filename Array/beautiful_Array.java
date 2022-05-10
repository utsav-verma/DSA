/**
 * *Find the permutations (Form a Beautiful Array)
 * !link :https://leetcode.com/problems/beautiful-array/
 */
import java.util.*;
public class beautiful_Array {
    
    static int k,n;
    static int res[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        // ArrayList<Integer> beautiful = new ArrayList<>();
        /**
         * *Approach 1
         */
        convert(m);

        /**
         * *Approach 2
         */
        res = new int[m];
        n=m;
        divideConque(1,1);
        System.out.println(Arrays.toString(res));
        // System.out.println("Result : \n"+beautiful);
    }
    /**
     * ! Approach 1
     * * convert()
     */
    public static void convert(int n)
    {
        
        if(n>=1)
        {
            ArrayList<Integer> beautiful = new ArrayList<>();
            beautiful.add(1);
            int size =beautiful.size();
            while(size!=n)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            // beautiful.clear();
            for(Integer i : beautiful)
            {
                // int even = 2*i;
                int odd = 2*i-1;
                // if(even<=n)
                // {
                //     temp.add(even);
                // }
                if(odd<=n)
                { 
                    temp.add(odd);
                }
            }
            for(Integer i : beautiful)
            {
                int even = 2*i;
                // int odd = 2*i-1;
                if(even<=n)
                {
                    temp.add(even);
                }
            }
            beautiful =temp;
            // System.out.println("Array : "+beautiful);
            // System.out.println("size : "+size);
            // temp.clear();
            size = beautiful.size();
        }
        System.out.println("Result "+beautiful);
    }
}
        
    /**
     * !Approach 1
     * * divideConque()
     */
    private static void divideConque(int start,int increment) {

            if(start+increment >n)
            {
                res[k++] = start;
                return;

            }
            /**
             * * Even + odd = odd
             * * Even+even = even
             * * Odd + odd = even
             */
            divideConque(start,2*increment);
            divideConque(start+increment,2*increment);

        
    }
        
    
}
