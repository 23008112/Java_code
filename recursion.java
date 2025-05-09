public class recursion {
    public static void main(String[] args) {
        
        welcome(5);
        
    }

    public static void welcome(int count)
    {
        // to avoid this overflow we need to set the base case -> when to stop the recurssion
        //base case

        if(count < 1)
        return ;
        System.out.println("Welcome to saveetha");
        welcome(count -1);
        //  prints later stack overflow 
    }
    
}
