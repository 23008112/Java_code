public class compliment {
    public static void main(String[] args) {
        String binary = "10101";
        StringBuilder compli= new StringBuilder();
        for(int i =0 ;i < binary.length() ; i++)
        {
            char bit= binary.charAt(i);
            if(bit == '0')
            {
                compli.append('1');
            }
            else if( bit =='1')
            {
                compli.append('0');
            }
            else
            {
                System.out.println("Invalid input");
            }

        }

        System.out.println(binary);
        System.out.println(compli.toString());
    }
    
}
