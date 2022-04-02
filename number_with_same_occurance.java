import java.util.*;
public class number_with_same_occurance {
    public static boolean same_occurence(List<Integer> occur)
    {
        for(Integer i :occur)
        {
            int index_f=occur.indexOf(i);//first index
            int last_index = occur.lastIndexOf(i);
            if(index_f!=last_index)//two numbers have same occurance
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(1);
        arr.add(1);
        arr.add(3);
        //[1,2,2,1,1,3]
        Collections.sort(arr);
        List<Integer> occur = new ArrayList<>();
        List<Integer> number = new ArrayList<>();
        int x =arr.get(0),k=0,count=1,y=0;
        System.out.println("Array > "+arr);
        for(int i=1;i<arr.size();i++)
        {
            y = arr.get(i);
            if(x==y)
            {
                count++;
            }
            else
            {
                occur.add(k,count);
                number.add(x);
                x=y;
                count=1;
                k++;
            }
        }
        //if last number occur once
        if(!number.contains(x))
        {
            number.add(x);
            occur.add(count);
        }
        System.out.println(same_occurence(occur));
    }
}
