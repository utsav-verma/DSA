import java.util.*;
public class shell_rotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][]={{11,12,13,14,15,16},
                    {21,22,23,24,25,26},
                    {31,32,33,34,35,36},
                    {41,42,43,44,45,46},
                    {51,52,53,54,55,56}};
        int s = in.nextInt();//shell to rotate
        int r = in.nextInt();//number of rotations
        ArrayList<Integer> list = oned(arr,s);
        Collections.rotate(list,list.size()-r);//rotate the matrix
        fillmatrix(arr,list,s);
        display(arr);
        

    }
    public static void display(int arr[][])
    {
        int r = arr.length,col =arr[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void fillmatrix(int arr[][],ArrayList<Integer>list,int s)
    {
        int minrow = s-1;
        int mincol = s-1;
        int maxrow = arr.length-s;
        int maxcol = arr[0].length-s;
        int i=0;
        //upper wall
        for(int j=mincol;j<=maxcol;j++)
        {
            // list.add(arr[minrow][j]);
            arr[minrow][j]=list.get(i++);
        }
        // right wall
        for(int j=minrow+1;j<=maxrow;j++)
        {
            // list.add(arr[j][maxcol]);
            arr[j][maxcol]=list.get(i++);
        }
        //lower wall
        for(int j=maxcol-1;j>=minrow;j--)
        {
            list.add(arr[maxrow][j]);
            arr[maxrow][j]=list.get(i++);
        }
        // Left wall
        for(int j=maxrow-1;j>minrow;j--)
        {
            // list.add(arr[j][mincol]);
            arr[j][mincol]=list.get(i++);
        }
    }
    public static ArrayList<Integer> oned(int arr[][],int s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int minrow = s-1;
        int mincol = s-1;
        int maxrow = arr.length-s;
        int maxcol = arr[0].length-s;

        //upper wall
        for(int j=mincol;j<=maxcol;j++)
        {
            list.add(arr[minrow][j]);
        }
        // right wall
        for(int j=minrow+1;j<=maxrow;j++)
        {
            list.add(arr[j][maxcol]);
        }
        //lower wall
        for(int j=maxcol-1;j>=minrow;j--)
        {
            list.add(arr[maxrow][j]);
        }
        // Left wall
        for(int j=maxrow-1;j>minrow;j--)
        {
            list.add(arr[j][mincol]);
        }
        return list;
    }
}
