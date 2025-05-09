import java.util.Scanner;
import java.util.Stack;

public class paraPair {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false; // No matching opening bracket
                
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            }
        }
        
        return stack.isEmpty(); // Stack should be empty if valid
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        paraPair solution = new paraPair();
        boolean result = solution.isValid(input);

        System.out.println(result);

        scanner.close();
    }
}
