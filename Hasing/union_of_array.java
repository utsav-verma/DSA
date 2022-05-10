import java.util.*;
public class union_of_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        int arr1[]= new int[a];
        int arr2[]= new int[b];
        for(int i =0;i<a;i++)
        {
            arr1[i]=in.nextInt();
            
        }
        for(int i =0;i<b;i++)
        {
            arr2[i]=in.nextInt();

        }
        HashSet<Integer> union_set= new HashSet<>();
        for(int i=0;i<a;i++)
        {
            union_set.add(arr1[i]); 
        }

        for(int i=0;i<b;i++)
        {
            union_set.add(arr2[i]);
        }
        System.out.println(union_set);
    }
}
