public class extra {
    
        public static void main(String[] args) {
            String s1 = "enna da idhu";
            String s2 = "ennaa da idhu";  // s2 has one extra character
    
            char result = 0;  // XOR identity
    
            // XOR all characters in both strings
            for (char c : s1.toCharArray()) {
                result ^= c;
            }
    
            for (char c : s2.toCharArray()) {
                result ^= c;
            }
    
            System.out.println("Extra character is: " + result);
        }
    }
    
    

