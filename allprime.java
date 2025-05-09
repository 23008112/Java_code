import java.util.Scanner;

public class allprime
{
    public static void main(String[] args) {
        Scanner ip =  new Scanner(System.in);
    int r = ip.nextInt();
    boolean[] isPrime = new boolean[r+1];
    for(int i=2;i<=r;i++)
    {
    isPrime[i] =true;
    }

    for(int j = 2; j<=r;j++)
    {
        if(isPrime[j])
        {
            for (int k = j*j; k <= r; k += j) { 
                isPrime[k] = false;
            }
        }
    }
    for (int i = 2; i <= r; i++) {
        if (isPrime[i]) {
            System.out.print(i + " ");
        }
    }
    
   
    
    ip.close();
    
    }
}
