public class RevStrRec {
    public static void main(String[] args) {
        String input = "four";
        System.out.println(rev(input));
        
    }
    public static String rev(String input)
    {
        if(input.length() ==0|| input.isEmpty())
        return "";

       // remove first letter and send the  remaining substring 
       // add the first character
        return rev(input.substring(1))+input.charAt(0);

    }
    
}
