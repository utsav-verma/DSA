import java.util.*;
public class rotate_number {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n =in.nextInt();
       int k=in.nextInt();
       String a = Integer.toString(n);
       int l=a.length();
       k=k%l;
       String result = a.substring(l-k,l)+a.substring(0,l-k);
       System.out.println(result);



       //Approach 2
       ArrayList<Character> list = new ArrayList<>();
       
   } 
}
