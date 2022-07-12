import java.util.ArrayList;

/*
 * slot_machine
 * Question is given in photo
 ! Approach :- Store the elements in prority Queue inside ArrayList, every time we pop the element we get the maximum element in row
 ! And keep on adding the max Element 
 */
import java.util.*;
public class slot_machine {
/**
 * @param args
 */
    public static void main(String[] args) 
    {
        
            Scanner in = new Scanner(System.in);
            int n =in.nextInt();
            List<String> history = new ArrayList<>();
            System.out.println("Enter the values");
            for(int i=0;i<n;i++)
            {
                history.add(in.next());
            }
            System.out.println(operation(history));
        

    }
    public static int operation(List<String> history)
    {
        ArrayList<PriorityQueue<Integer>> historyPart = new ArrayList<>();
        insert(history,historyPart);
        int sum=0,max,flag=0;
        System.out.println(historyPart);
        while(flag!=1)
        {
            max =Integer.MIN_VALUE;
            for(PriorityQueue<Integer>Utils:historyPart)
            {
                if(Utils.isEmpty()){
                    flag=1;
                    // System.out.println(flag);
                    break;
                }
                else
                {
                    int remove =Utils.poll();
                    max = max>remove?max:remove;
                    // System.out.println(remove);
                }
            }
            if(flag!=1)
            sum+=max;
        }
        return sum;


    }
    private static void insert(List<String>history,ArrayList<PriorityQueue<Integer>>historyParts)
    {
        for(String num: history)
        {
            PriorityQueue<Integer> historyPartUtils = new PriorityQueue<>(Collections.reverseOrder());
            for(int i=0;i<num.length();i++)
            {
                historyPartUtils.add(num.charAt(i)-'0');
            }
            historyParts.add(new PriorityQueue<>(historyPartUtils));
        }
    }
    
}