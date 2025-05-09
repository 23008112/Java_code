import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.close();
        int org =n;
        int rem;
        int temp=n;
        int dig =0;

        int power=0;
        while(temp>0)
        {
            power++;
            temp=temp/10;
        }
        System.out.println(power);

        while(n>0)
        {
            rem = n%10;
            dig = dig +  (int)Math.pow(rem, power);

            n=n/10;
        }
        if (org == dig)
        System.out.println("This is a armstrong number");
        else
        System.out.println("This is not an armstrong number");

        
    }
    
}
