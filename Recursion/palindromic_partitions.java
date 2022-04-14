import java.util.*;
public class palindromic_partitions {
    /*Program to print palindromic partitions of String*/
    /*https://www.geeksforgeeks.org/given-a-string-print-all-possible-palindromic-partition/*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n =in.next();
        allPartition(n);
        // System.out.println(isPalin(n, 0, n.length()-1));
        // System.out.println(isPalin(s, l, r));

    }
    public static void allPartition(String input)
    {
        int n = input.length();
        ArrayList<ArrayList<String>>allPart = new ArrayList<>();
        Deque<String> currPart = new LinkedList<>();
        allPartitionUnit(allPart,currPart,0,n,input);

        //Displaying the Palindrome partitions

        for(int i=0;i<allPart.size();i++)
        {
            for(int j=0;j<allPart.get(i).size();j++)
            {
                System.out.print(allPart.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
    
    private static void allPartitionUnit(ArrayList<ArrayList<String>> allPart, Deque<String> currPart, int start, int n,
            String input) {
                if(start>=n)
                {
                    allPart.add(new ArrayList<>(currPart));
                    return;//terminates the recursion
                }

                for(int i=start;i<n;i++)
                {
                    if(isPalin(input, start, i))
                    {currPart.add(input.substring(start,i+1));
                    allPartitionUnit(allPart, currPart, i+1, n, input);
                    currPart.removeLast();
                    }

                }
    }
    public static boolean isPalin(String s,int l,int r)
    {
        if(l>=r)
        {return true;}
        
        char c =s.charAt(l);
        char z =s.charAt(r);
        if(c!=z)
        return false;
        return true;
    }
}
