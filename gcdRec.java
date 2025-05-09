public class gcdRec {
    public static void main(String[] args) {
        int a = 49;
        int b = 35;
        
        System.out.print(recc(a,b));
        
    }

    public static int recc(int a , int b)
    {
        if(b ==0)
        return a ;

        
        return recc(b,a%b);
        
    }
    
}
