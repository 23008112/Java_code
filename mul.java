import java.util.Scanner;

public class mul {
    public static void main(String[] args)
    {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int m = ip.nextInt();
        ip.close();
      

        
        int sum =0;
        int i;

        for(i=1;i<=Math.abs(n);i++)
        {
            sum +=m;
        }

        if (n<0) {
            sum = -sum;
           
        } 
        System.out.print(sum);
        }
        

        




    }
    

