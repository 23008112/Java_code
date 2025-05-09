public class cube {
    public static void main(String[]args){
        int num=27,root=3;
        double left=0;
        double right=num;
        double middle=0;
        double error=0.000000001;
        multiply(num,root);
        while((right-left)>error){
            middle=(left+right)/2;
            if(multiply(middle,root)>num){
                right=middle;
            }else{
                left=middle;
            }
        }
        System.out.println(middle);
        
    }
    public  static double multiply( double num,double root){
        double multvalue=1;
        for(int i=0;i<root;i++){
            multvalue=multvalue*num;
        }
        return multvalue;
    }
    
}