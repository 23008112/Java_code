public class exception {
    public static void main(String[] args) {
        int a= 12;
        int b = 0;
        int res =0;

        try{
            res = a/b;

        }catch(ArithmeticException e)
        {
            System.out.println("Dont divide by Zero");
        }

        System.out.print(res);
    }
    
}
