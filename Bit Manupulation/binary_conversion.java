/**
 * binary_conversion
 */
import java.util.*;
public class binary_conversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number =in.nextInt();
        int binary = toBinary(number);
        int y =~(5&0);
        System.out.println(y);
        
    }
    static int count=0;
    // private static int toogle()
    private static int toDecimal(int number) {
        int count=0;
        int ans=0;
        while(number!=0)
        {
            int d=number%10;
            ans += d*(int)Math.pow(2,count++);
            number/=10;
        }
        return ans;
    }

    private static int toBinary(int number) {
        String bin="";
        while(number !=0)
        {
            bin=Integer.toString(number%2)+bin;
            number/=2;

        }
        return Integer.parseInt(bin);
    }
}