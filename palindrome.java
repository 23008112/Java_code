import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
     {
        int n;
        Scanner ip = new Scanner(System.in);
        n=ip.nextInt();
        int revdig;
        revdig =0;
        if(n<0 || (n%10 == 0&& n != 0))
        {
            System.out.println("This is not palindrome");
            
        }
        else{
        while(n>revdig)
        {
            int dig = n%10;
            revdig = dig + revdig*10;
            n = n/10;

        }

        
        if(n==revdig || n == revdig/10)
        System.out.println("This is palindrome");
        else
        System.out.println("This is not a palindrome");
    }

        ip.close();

        

    }
    
}
