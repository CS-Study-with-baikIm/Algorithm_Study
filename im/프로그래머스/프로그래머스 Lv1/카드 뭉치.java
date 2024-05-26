import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> st1 = new LinkedList<>();
        Queue<String> st2 = new LinkedList<>();

        for(String i : cards1){
            st1.add(i);
        }
        for(String i : cards2){
            st2.add(i);
        }
        st1.add("last");
        st2.add("last");
        for(int i = 0; i < goal.length; i++){
            if(st1.peek().equals(goal[i])){
                st1.poll();

            }
            else if(st2.peek().equals(goal[i])){

                st2.poll();

            }
            else return "No";
        }

        return "Yes";
    }
}