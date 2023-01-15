/*
 * multiplication using bitwise
 */
public class multiplication {

    public static void main(String[] args) {
        int x=5,y=5;
        int ans=0;
        while(y>0)
        {
            if((y&1)==1)
            {
                ans+=x;
            }
            x<<=1;
            y>>=1;
        }
        System.out.println(ans);;
    }
}