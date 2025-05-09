import java.util.*;

public class longSubstrNoRep {
    public static void main(String[] args) {
        String input = "pwwkew";

        int max = 0;
        int left = 0;
        // two point approach with hash map

        /*
         * HashMaps<char , int> position = new HashMap();
         * //dimension to complete typeArgument , Reference argument
         * // cannot use primitive datatype in collection it will not iherit
         * 
         * // you have wrapper classes wraps around your primitive datatype to give non
         * primitive functionality
         */

        HashMap<Character, Integer> position = new HashMap<>();

        for (int right = 0; right < input.length(); right++) {
            char current = input.charAt(right);
            if (!position.containsKey(current))// in position hash map if it is not present we put it
                                               // in third iteration (w) is already present this fails goes to else

                                              // r =e ->4 shoud insert it
                                             // current is w already present last w goes to else
            {
                position.put(current, right); // in second iteration position of w will be added to hash
            } else                           // if it is there should shif the left pointer
            {
                left = Math.max(left, position.get(current) + 1); // current r = w need to shift the left pointer
                                                                  // index of w in hashmap 1+1
                                                                  // prev left = 0 0,2 now value of left is 2

                                                                  // already w =2 now +1 = 3
                position.put(current, right); // previous value stored in w is 1
                                              // now it is 2 the value of another w
                                              // now it i 5 since right is 5

            }
            max = Math.max(max, (right - left) + 1);// first iteration 0 , 1 now max will be 1
                                                    // second iteration 1, 1-0+1 -> 1,2 now max will be 2

                                                    // now the current w is one
                                                    // but the previous value max is 2 so it will be retained (r-l+1 -> 2-2+1)

                                                    // pw
                                                    // wk
                                                    // wke
                                                    // max =3
                                                    // kew
                                                    // max = 3,3 remains 3
        }
        System.out.println(max);

    }

}
