import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        int n = ip.nextInt();
        int sum=0;
        int org = n;

        for(int i =1;i<=n/2;i++)
        {
            if(n%i ==0)
            {
                sum = sum+i;
            }

        }
        if(sum == org)
        System.out.println("This is a perfect number");
        else
        System.out.println("This is not a perfect number");
        ip.close();
    }
    
}
