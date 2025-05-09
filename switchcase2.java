import java.util.*;

public class switchcase2 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int choice = ip.nextInt();
        int a = ip.nextInt();
        int b = ip.nextInt();
        int result = 0;
        ip.close();

        if (choice == 5) {
            System.out.println("Exiting Calculator. Goodbye!");
            return ;
        }

        switch (choice) {
            case 1:
                result = add(a, b);
                System.out.print(result);
                break;

            case 2:
                result = sub(a, b);
                System.out.print(result);
                break;

            case 3:
                result = mul(a, b);
                System.out.print(result);
                break;

            case 4:
                result = div(a, b);
                System.out.print(result);
                break;

            default:
                System.out.println("Invalid choice");
                break;

        }
        
    }

}
