public class sumArrRec {
    public static void main(String[] args)
     {
        int arr[] = {4,7,8,3,3};
        int n = arr.length;
        System.out.print(sumArr(arr,n));
    

        
    }
    public static int sumArr(int arr[],int n)
    {
        if(n <=0)
        return 0 ;

        return arr[n-1]+sumArr(arr,n-1);

    }
    
}
