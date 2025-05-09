import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int flag =0;

        for(int k = 0;k<n;k++)
        {
            arr[k] = sc.nextInt();
        }

        for(int i =0;i < n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(arr[j] == arr[i])
                {
                flag = 1;
                break;
                }
            }


            }

        

        if(flag == 1)
        System.out.println("There is a duplicate value");
        else
        System.out.println("There is no duplicate");
        sc.close();
        }
            }
        
        
    
    

