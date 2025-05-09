public class commonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "fly"};

        if (words == null || words.length == 0) {
            System.out.println("No common prefix");
            return;
        }

        String prefix = "";

        // Take the first word as the base to compare
        String first = words[0];

        // Loop through each character in the first word
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            // Compare this character with all other strings
            for (int j = 1; j < words.length; j++) {
                // If index exceeds or character doesn't match
                if (i >= words[j].length() || words[j].charAt(i) != ch) {
                    System.out.println("Longest Common Prefix: " + prefix);
                    return;
                }
            }

            // If current character matched in all strings
            prefix += ch;
        }

        System.out.println("Longest Common Prefix: " + prefix);
    }
    
}








