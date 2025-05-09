import java.util.Scanner;
public class factrec {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.close();
        System.out.print(fact(n));

        
    }

    public static int fact(int n)
    {
        if(n ==0 || n == 1)
        return 1;
        else
        return n *fact(n-1);

    }
    
}
