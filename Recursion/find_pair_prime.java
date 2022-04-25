import java.util.*;

/*
p*q<=n , we have to find p and q such that p and q are prime
*/
/*
Approach would be iterate from p =2 and recursively from p to n/p and 
check they are less n  or not it yes add the pair to array list
*/  
public class find_pair_prime {
    static boolean isPrime[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<=n;i++)
        {
            for(int j=2*i;j*i<=n;j++)
            {
                isPrime[j]=false;
            }
        }
        pair(n);
        // for(int i=2;i<=n/2;i++)
        // {
        //     for(int j=2;i*j<=n;j++)
        //     {
        //         if(i*j<=n && isPrime[i]&&isPrime[j])
        //         System.out.print(i+" "+j+" ");
        //     }
        // }
    }
    public static void pair(int n)
    {
        ArrayList<Integer> allPair = new ArrayList<>();
        find_pair(allPair,n,2);
        if(!allPair.isEmpty()){
        for(Integer i:allPair)
        System.out.print(i+" ");
        System.out.println();}
        else
        System.out.println("No such pair Exists");
    }

    
    public static void find_pair(ArrayList<Integer> allPair,int n,int p)
    {
       if(p>(n/2))
       {
           return;
       }
       if(isPrime[p]){

           for(int q =2;q*p<=n;q++)
           {
               if(p*q<=n&& isPrime[q])
               {
                    allPair.add(p);
                    allPair.add(q);
               }
           }
       }
       find_pair(allPair,n,p+1);
    //    return;
    }
    //Seive of Eratosthenes
    // Time Complexity is O(n)
}

