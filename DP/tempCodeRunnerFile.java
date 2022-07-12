private static int findCount(int[] arr, int i,int s ,int sum, int diff) {
    //     if(i==arr.length)
    //     {
    //         return 0;
    //     }


    //     if(2*(arr[i]+s)==(sum+diff))
    //     {
    //         return 1+findCount(arr,i+1,s+arr[i],sum,diff)+findCount(arr,i+1,s,sum,diff);
    //     }
    //     if(2*(arr[i]+s)>(sum+diff))
    //     {
    //         return findCount(arr,i+1,s,sum,diff);
    //     }
    //     return findCount(arr,i+1,s+arr[i],sum,diff)+findCount(arr,i+1,s,sum,diff);
    // }