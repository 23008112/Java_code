import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n =  ip.nextInt();
        ip.close();
        BigInteger fact = BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.print(fact);
        int count=0;

        while(fact.mod(BigInteger.TEN).equals(BigInteger.ZERO))
        {
            count++;
            fact = fact.divide(BigInteger.TEN); 

        }

       

        
        System.out.print("\n");
        System.out.print(count);
    }
    
}
