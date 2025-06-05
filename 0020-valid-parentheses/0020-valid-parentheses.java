import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (!stack.isEmpty()) {
                char last = stack.peek();
                if (isPair(last, current)) {
                    stack.pop(); // matched pair, so pop
                    continue;
                }
            }

            stack.push(current);
        }

        return stack.isEmpty(); 
    }

    private boolean isPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
