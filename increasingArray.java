public class increasingArray {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0]= 1;
        arr[1]=2;
        arr[2]=5;
        arr[3]=4;

        int i ,j;
        int flag =0;
        for (i=0;i<4;i++)
        {
            for(j = i+1;j<4;j++)
            {
                if(arr[i]>arr[j])
                {
                    flag=1;
                    break;
                }
            }

        }
        if(flag == 0)
        {
            System.out.println("It is an increasing array");
        }
        else
        {
            System.out.println("It is not an increasing array");
        }

        

        
    }
    
}
