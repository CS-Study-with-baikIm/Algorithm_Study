import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] str = new String[numbers.length];


        for(int i = 0; i < str.length; i++){
            str[i] = ""+numbers[i];
        }

        Arrays.sort(str, new Comparator<String>(){

            @Override
            public int compare(String a, String b) {
                String s1 = a+b;
                String s2 = b+a;
                return s1.compareTo(s2);
            }

        });

        // for(int i = 0; i < str.length-1; i++){
        //     for(int j = i+1; j < str.length; j++){
        //         String s1 = str[i] + str[j];
        //         String s2 = str[j] + str[i];
        //         if(s1.compareTo(s2) > 0){
        //             String tmp = str[j];
        //             str[j] = str[i];
        //             str[i] = tmp;
        //         }
        //     }
        // }

        if(str[str.length-1].equals("0")) return "0";

        String answer = "";

        for(int i = 0; i < str.length; i++){
            answer = str[i] + answer;
        }


        return answer;
    }
}