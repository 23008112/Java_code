import java.util.Scanner;
public class trailZero {
    public static void main(String[] args) {
        int count=0;
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        while(n>=5)
        {
            count = count + n/5;
            n=n/5;
        }

        System.out.print(count);

        /*int count2 =0;
        for(int i = 5;n/1>=5 ;i=i*5)
        {
            count2 = 
        }*/

        ip.close();
    }
    
}
