import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<String> stack = new Stack<>();
        String[] split = s.split("");

        for (int i = 0; i < split.length; i++) {
            if (!stack.isEmpty() && stack.peek().equals(split[i])) {
                stack.pop();
            } else {
                stack.push(split[i]);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}