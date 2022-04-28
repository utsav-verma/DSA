import java.util.*;
public class max_vowel_count {
    public static int Vowel_count(String s,int start,int end)
    {
        int count=0;
        char c=' ',z=' ';
        while(start<=end)
        {
            if(start==end)
            {
                c = s.charAt(start);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                {
                    count++;
                }
            }
            else
            {
                c= s.charAt(start);
                z= s.charAt(end);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                {
                    count++;
                }
                if(z=='a'||z=='e'||z=='i'||z=='o'||z=='u')
                {
                    count++;
                }
            }
            start++;end--;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n =in.next();
        int k =in.nextInt();
        int count = Vowel_count(n,0,k-1);//1st vowels
        int start =1,end = k-1;//next range
        int max_count=count;// total number of vowels in first window
        int index=0;
        /*
        n = "azerdpii"
        k=5
        azerd :- 2 index : - 0
        zerdp :- 1 
        erdpi :- 2
        rdpii :- 2

        */
        while(end<n.length())
        {
            char c = n.charAt(start-1);
            char z = n.charAt(end);
            //Vowel Check
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                count--;
            }
            if(z=='a'||z=='e'||z=='i'||z=='o'||z=='u')
            {
                count++;
            }
            //Does this current Window have more Vowels
            if(count>max_count)
            {
                max_count=count;
                index=start;
            }
            start++;
            end = start+k-1;
            //Moving entire Window
            
        }
        System.out.println("Index : "+index);
        System.out.println("String is : "+n.substring(index,index+k));
    }
    
}
