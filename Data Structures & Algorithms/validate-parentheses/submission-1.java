class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> openToClose = new HashMap<>();
        openToClose.put(')', '(');
        openToClose.put(']', '[');
        openToClose.put('}', '{');

        for(char c : s.toCharArray()) {
            if(openToClose.containsKey(c)){
                if(!stack.isEmpty() && stack.peek().equals(openToClose.get(c))) {
                    stack.pop();
                }
                else
                    return false;
            }
            else {
                stack.push(c);
            }            
        }
        if(stack.isEmpty())
            return true;
        else return false;
    }
}
