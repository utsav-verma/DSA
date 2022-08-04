public static int count_subset(int arr[],int i,int s1,int sum)
    // {
    //     if(i==arr.length)
    //     return 0;

    //     if(mat[i][s1]!=-1)
    //     return mat[i][s1];
    //     if(2*(arr[i]+s1)==sum)
    //     {
    //         mat[i][s1]= 1+count_subset(arr,i+1,s1+arr[i],sum)+count_subset(arr,i+1,s1,sum);
    //     }
    //     else
    //     mat[i][s1]= count_subset(arr,i+1,s1,sum)+count_subset(arr,i+1,s1+arr[i],sum);

    //     return mat[i][s1];
    // }