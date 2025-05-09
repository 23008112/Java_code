import java.util.*;
public class nthroot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find the root: ");
        double value = sc.nextInt();
        System.out.println("Enter the value of root: ");
        double root = sc.nextInt();

        double left = 0;
        double middle =0;
        double right = value;
        double error = 0.00000000001;


        while((right - left) > error)
        {
            middle=(right +left)/2;
            if(multiply(middle,root)> value)
            {
                right = middle;
            }
            else
            {
                left = middle;
            }
        }
        System.out.println("Root is "+middle);
    }

    private static double multiply(double middle, double root)
    {
        double power =1;
        for(int i =0;i<root;i++)
        {
            power = power*middle;
        }
        return power;
    }
    
}
