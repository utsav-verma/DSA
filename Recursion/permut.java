import java.util.*;
public class permut {
    public static boolean isPow(int n)
    {
        double pow = Math.log10(n)/Math.log10(2);
        int p =(int)(Math.log10(n)/Math.log10(2));
        if(pow==p)
            return true;
        return false;
    }
    public static void permutation(String n,int st,Set<String>set)
    {
        if(st==n.length())
        {
            set.add(n);
            return;
        }
        for(int i=st;i<n.length();i++)
        {
            n= swap(n,st,i);
            System.out.println(i+"  "+n);
            permutation(n,i+1,set);
            n =swap(n,st,i);
            System.out.println(i+"  "+n);
        }
        
    }
    public static String swap(String n,int i,int j)
    {
        char c1 =n.charAt(i),c2=n.charAt(j);
        StringBuilder st = new StringBuilder(n);
        st.setCharAt(i,c2);
        st.setCharAt(j,c1);
        return st.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        Set<String>set =new HashSet<>();
        String m= Integer.toString(n);
        permutation(m,0,set);
        // System.out.println(
        System.out.println(set);
    }
}
