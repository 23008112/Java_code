public class polymor {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;

        double output = calc((double)n1 , (double)n2);

        System.out.println(calc (n1,n2));//15
        System.out.println(calc (n1));//100
        System.out.println(output);

    


    }    
    //for overloading we can change three things
    //no of parameter passed -> sent along with method 
    //types of parameter passed
    //return type



    //changing the no of parameter
    public static int calc (int a, int b)//method called calc taked two variable
    {
        return a+b;
    }

    public static int calc (int a)//same method name but only one parameter
    {
        return a*a;
    }

    public static double calc(double a,  double b)
    {
        
       
        return a*b;

    }


    //for overloading we can change three things
    //no of parameter passed -> sent along with method 
    //types of parameter passed
    //return type
    
}
