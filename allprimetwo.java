import java.util.Scanner;

public class allprimetwo {
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        boolean[] isPrime = new boolean[n+1];
        for(int i=2;i<=n;i++)
        {
            isPrime[i]=true;
        }

        for(int j = 2; j*j <=n ;j++)
        {
            if(isPrime[j])
            {
                for(int k = j*j;k <=n; k+=j )
                {
                    isPrime[k]=false;
                    

                }
            }

        }

        for(int i=2;i<=n;i++)
        {
            if(isPrime[i])
            {
                System.out.print(i+" ");
            }

        }

        ip.close();


    }
    
}
