import java.util.*;
public class josephous_problem {

    public static int josephous(int n ,int k)
    {
        if(n==1)
        return 0;
        return (josephous(n-1,k)+k)%n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int k =in.nextInt();
        int remain = josephous(n,k);
        System.out.println(remain);
    }
}
