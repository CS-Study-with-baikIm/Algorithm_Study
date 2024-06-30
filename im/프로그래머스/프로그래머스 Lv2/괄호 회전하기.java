import java.util.*;

class Solution {
    public int solution(String s) {
        if(s.length() %2 == 1) return 0;
        if(s.length() == 0) return 0;

        int answer = 0;


        for(int i = 0; i < s.length(); i++){
            String tmp = s.substring(s.length() - i, s.length()) + s.substring(0, s.length() - i);
            // System.out.println(tmp);
            if(check(tmp)) answer++;
        }
        return answer;
    }

    public boolean check(String str){



        int count = 0;
        Stack<Integer> stack1 = new Stack<>(); //(


        for( int i = 0; i < str.length(); i++){



            if(str.charAt(i) == '(' ) stack1.add(1);
            if(str.charAt(i) == '{') stack1.add(2);
            if(str.charAt(i) == '[') stack1.add(3);

            if(str.charAt(i) == ')' && !stack1.isEmpty() && stack1.peek() == 1) {
                stack1.pop();
                count++;
            }
            if(str.charAt(i) == '}' && !stack1.isEmpty() && stack1.peek() == 2) {
                stack1.pop();
                count++;
            }
            if(str.charAt(i) == ']' && !stack1.isEmpty() && stack1.peek() == 3) {
                stack1.pop();
                count++;
            }
        }

        if(count*2 == str.length()) return true;
        return false;
    }
}