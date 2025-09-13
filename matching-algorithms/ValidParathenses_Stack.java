/*
 * Given a string containing only brackets: (), {}, [].  The string is valid  if every opening
 * bracket has a matching closing bracket of the same type, and all brackets are closed in the correct order. 
 * 
 * Return true if the string is valid, otherwise return false.
 */

class Solution {
    public boolean isValid(String s) {
        //create the stack where you will store all opening brackets, parentheses, etc.
        Stack<Character> stack = new Stack<Character>();

        //create a hashmap to compare every closing bracket in the original String s 
        //with its corresponding opening bracket.  Look up by key, closing bracket and 
        //return the value, opening bracket.
        Map<Character, Character> closeMatch = new HashMap<>();
        closeMatch.put(')', '(');
        closeMatch.put(']', '[');
        closeMatch.put('}', '{');

        //iterate over the string provided and convert it to an array of characters
        for (char c : s.toCharArray()) {
            //check if character matches a key in the hashmap
            if(closeMatch.containsKey(c)) {
                //check if my stack is not empty and if the last item in the stack matches 
                //the value of the key for that hashmap
                if(!stack.isEmpty() && stack.peek() == closeMatch.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        //return true if stack is empty or false if we reached the end of the iteration and
        //the stack still has items.
        return stack.isEmpty();
    }
}