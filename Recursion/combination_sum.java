/**
 * <h1> Find the combinations that equals to that sum </h1>
 * 
 * <h4> [@link](https://www.geeksforgeeks.org/combinational-sum/)
 * 
 */
/**
 * combination_sum
 */
import java.util.*;

public class combination_sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] ={2,0, 4, 6, 8};
        int x =8;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> allPart = new ArrayList<>();
        count_sums(arr,allPart,list,0,x,0);
        for(ArrayList<Integer>i:allPart)
        {
            System.out.println(i);
        }
    }

    private static void count_sums(int arr[],ArrayList<ArrayList<Integer>>allPart,ArrayList<Integer> listCombo, int index, int x, int currentSum) {
        if(index==arr.length)
        return;
        if(currentSum==x)
        {
            allPart.add(new ArrayList<>(listCombo));
            return;
        }
        if(currentSum>x){

                return;
        }
        if(arr[index]+currentSum>x)
        {
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                listCombo.add(0);
                count_sums(arr, allPart, listCombo, i+1, x, arr[i]+currentSum);
                listCombo.remove(listCombo.size()-1);//backtrack
            }
            else{

                listCombo.add(arr[i]);
                count_sums(arr, allPart, listCombo, i, x, arr[i]+currentSum);
                listCombo.remove(listCombo.size()-1);//backtrack
            }
            
        }
    }
}