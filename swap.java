public class swap {
    public static void main(String[] args) {
        //3 times xor pota varum
        int a = 10;
        int b = 2;

        a= a^b;
        b=a^b;
        a=a^b;

        System.out.print(a);
        System.out.println("");
        System.out.print(b);
    }
    
}
