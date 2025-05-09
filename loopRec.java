public class loopRec {
    public static void main(String[] args) {
        for(int i = 1 ;i <= 100;i++)
        {
            System.out.print(i +" ");
        }
        System.out.println(" ");

        System.out.println("Recursion");
        hund(1);
    }

    public static void hund(int count)
    {
        if(count > 1000000)
        return;

        System.out.print(count+" ");
        hund(count+1);

    }
    
}
