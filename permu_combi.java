import java.util.*;

public class permu_combi {
    public static void main(String[] args) {
        String input = "abc";
        ArrayList<String> result = new ArrayList<String>();
        // calling the method
        
        permutation(input,"",result);
        System.out.println(result);
        
    }
    public static void permutation(String str, String permu,ArrayList<String> result ){
        if(str.length()==0 || str.isEmpty()) // base condition
        // store the data will be able to access it
        result.add(permu);

        // iteratively move through your current string (first layer of the tree)
        for(int i =0;i < str.length();i++)
        {
            //find the current character
            String curr = ""+str.charAt(i); // when trows an error concat it with empty string

            // after removing the current char it is the remaining string if we add the sub string it is the permutation
            String rest = str.substring(0,i)+ str.substring(i+1);

            permutation(rest,permu + curr,result); 

        }

        
    }
    
}
