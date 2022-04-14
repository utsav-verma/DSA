import java.util.*;
public class powerset {
    public static void subset(String s,int i,String car)
    {
        if(i==s.length())
        {
            System.out.println(car);
            return;//terminating the recurssion
        }
        char c = s.charAt(i);
        subset(s,i+1,c+car);
        subset(s,i+1,car);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =in.next();
        subset(s,0,"");
    }
}
