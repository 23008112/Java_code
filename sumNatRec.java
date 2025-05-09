public class sumNatRec {
    public static void main(String[] args) {
        int n = 5;
        System.out.print(sumNat(n));
        
    }
    public static int sumNat(int n)
    {
        if (n<1)
        return 0;


       return n + sumNat(n-1);
    }
}
