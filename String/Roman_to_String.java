import java.util.*;

/*
 Question is to convert Roman Number to Number like III become 3
 XIII becomes 13
*/
/*
Simple approach I it will add 1 if its I followed by V then it will be 5-1  and soon
we will store the predefined Roman in ArrayList
*/
/**
 * Roman_to_String
 */
public class Roman_to_String {

    static ArrayList<Integer> list;
    static Map<Character,Integer> roman;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int a =Integer.parseInt(in.nextLine());
        
        Map<Character,Integer> roman= new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);


       String n=in.next();
       convert(n,roman);



        //displaying answer
        
    }
    private static void convert(String n,Map<Character,Integer>roman) {
        list = new ArrayList<>();
        int l=n.length();
        int num=0;
        for(int i=0;i<l;i++)
        {
            char c = n.charAt(i);
            int val = roman.get(c);
            if(i>0){

                if(c!='I' && n.charAt(i-1)=='I')
                {
                    num+=val-2;
                }
                else
                num+=val;
            }
            else
            num+=val;


        }
        System.out.println(num);


    }
}