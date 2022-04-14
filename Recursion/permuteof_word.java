import java.util.*;
public class permuteof_word {
    public static String swap(String s,int i,int j)
    {
        StringBuilder st = new StringBuilder(s);
        char c =s.charAt(i);
        char z =s.charAt(j);
        st.setCharAt(i, z);
        st.setCharAt(j, c);
        return st.toString();
    }
    public static void permut(String s,int i,int l)
    {
        if(i==l)
        {
            System.out.println(s);
            return;
        }
        for(int j=i;j<s.length();j++)
        {
            s=swap(s,j,i);
            permut(s,i+1,l);
            s =swap(s,j,i);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n =in.next();
        permut(n,0,n.length()-1);
    }
}
