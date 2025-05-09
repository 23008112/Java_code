import java.util.*;
public class checkArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int[] arr = new int[5];
        int[] arr1 = new int[5];
        int flag =0;

        for(int k = 0;k<5;k++)
        {
            arr[k] = sc.nextInt();
        }

        for(int s = 0;s<5;s++)
        {
            arr1[s] = sc.nextInt();
        }

        for(int i = 0; i <5;i++)
        {
            for(int j = 0;j<5;j++)
            {
                if(arr[i] == arr1[j])
                {
                System.out.print(arr[i]);
                flag = 1;
                
                break;
                }
            }
        }

        if(flag ==0)
        System.out.println("This does not have duplicate");
        else
        
            System.out.println("This has duplicate");

            sc.close();

        
        
        
        
    }
    
}
