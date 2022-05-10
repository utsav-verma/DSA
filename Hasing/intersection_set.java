import java.util.*;
public class intersection_set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        while(a-->0)
        {
            set1.add(in.nextInt());
        }
        while(b-->0)
        {
            set2.add(in.nextInt());
        }
        HashSet<Integer> intersect_set = new HashSet<>();
        if(set1.size()>set2.size())
        {

            for(Integer i :set1)
            {
                if(set2.contains(i))
                intersect_set.add(i);
            }
        }
        else
        {
            for(Integer i :set2)
            {
                if(set1.contains(i))
                intersect_set.add(i);
            }

        }
        System.out.println(intersect_set);
    }
}
