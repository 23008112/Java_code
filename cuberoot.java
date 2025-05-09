import java.util.Scanner;

public class cuberoot {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        double high = (double) n;
        double low = 0;
        double precission = 0.0001;

       
        
        while (high - low > precission) {
            double mid = (high + low) / 2;
            double croot = mid * mid * mid;

            if (croot > n) {
                high = mid;
            } else {
                low = mid;
            }

        }
    
        System.out.print(low);

        ip.close();
    }

}
