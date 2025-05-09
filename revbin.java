public class revbin {
    public static void main(String[] args) {
        int org = 10;
        
        StringBuilder res = new StringBuilder();

        int a =org;
        // last digit least significat do &1

        while(a>0)
        {

        int last = a &1 ;
        res.append(last);
        
        a = a>>1;
        }

       
        System.out.println(org);
        System.out.println(Integer.toBinaryString(org));
        System.out.println("Reversed Binary: ");
        System.out.println(res);
        int num = Integer.parseInt(res.toString(), 2);

        System.out.println(num);
        
        
        
       

    }
    
}
