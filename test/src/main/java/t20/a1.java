package t20;


import java.util.HashMap;
import java.util.Stack;

public class a1 {

    // Hash table that takes care of the mappings.
    private HashMap<String, String> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public void Solution() {
        this.mappings = new HashMap<String, String>();
        this.mappings.put(")", "(");
        this.mappings.put("}", "{");
        this.mappings.put("]", "[");
    }

    /**
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Solution();
        // Initialize a stack to be used in the algorithm.
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i,i+1);

            // If the current character is a closing bracket.
            if (this.mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                String topElement = stack.empty() ? "#" : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.

                String tmp = this.mappings.get(c);
                if (! topElement.equals(tmp)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        a1 a = new a1();
        String str = "{()}";
        System.out.println(a.isValid(str));
    }

}
