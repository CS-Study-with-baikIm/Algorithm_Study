import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<String> strList = new ArrayList<>();
        String tmp = "";
        for(int i = 1; i < s.length()-1; i++){

            if(s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                tmp+=s.charAt(i);
            }
            if(s.charAt(i) == ','){
                if(tmp.length()>0){
                    tmp +=" ";
                }

            }
            if(s.charAt(i) == '}'){
                if(tmp.length()>0){
                    strList.add(tmp);
                    tmp ="";
                }
            }
        }


        for(int i = 0; i < strList.size(); i++){
            for(int j = i; j< strList.size(); j++){
                if(strList.get(i).length() > strList.get(j).length()){
                    Collections.swap(strList, i, j);
                }
            }
        }

//          for(int i = 0; i < strList.size(); i++){
//             System.out.println(strList.get(i));
//         }


        int[] answer = new int[strList.size()];


        for(int i = 0; i < strList.size(); i++){
            String[] sp = strList.get(i).split(" ");
            int idx = 0;

            for(int j = 0; j < sp.length; j++){
                idx += j;
            }

            for(int j = 0; j < sp.length; j++){
                for(int k = 0; k < answer.length; k++){
                    if(answer[k] == Integer.parseInt(sp[j])) idx-=j;
                }
            }

            answer[i] = Integer.parseInt(sp[idx]);
        }


        return answer;
    }
}