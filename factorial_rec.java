public class factorial_rec {
    public static void main(String[] args) {
        int res = fact(5);
        System.out.print(res);

        
    }
    public static int fact(int n)
    {
        if(n<1)
        return 1;

        
        return n * fact(n-1);
        
    }
    
}
