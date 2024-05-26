import java.util.*;

class Solution {
    public int[] solution(String s) {
        int zero = 0;
        int count = 0;

        while(!s.equals("1")){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0'){
                    zero++;
                    s= s.substring(0,i) + "2" + s.substring(i+1);
                }
            }

            s= s.replace("2", "");
            s = binary(s);
            count++;
        }


        int[] answer = {count, zero};


        return answer;
    }

    public String binary(String str){
        int length = str.length();
        String bi = "";
        while(length > 0){
            bi = "" + length%2 + bi;
            length /= 2;
        }
        return bi;
    }

}