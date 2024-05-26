class Solution {
    public String solution(String X, String Y) {

        /*
            2중 반복문을 선택하여 풀었을 때 예제는 풀렸지만 체점과정에서 시간초과 문제 발생

            중복된 문자를 저장하는 것이 아닌 0~9까지의 갯수를 배열로 저장하고
            중복된 만큼 숫자를 반복하는 방식으로 변환
        */



        String answer = "";
        int[] arrX= new int[10];
        int[] arrY= new int[10];
        for(int i = 0 ; i < 10; i++){
            String tmp = "" + i;
            arrX[i] = X.length() - X.replace(tmp, "").length();
            arrY[i] = Y.length() - Y.replace(tmp, "").length();
        }


        for(int i = 0 ; i < 10; i++){
            int min = arrX[i] < arrY[i] ? arrX[i] : arrY[i];
            if(min > 0){
                String tmp = "" + i;
                tmp = tmp.repeat(min);
                answer = tmp + answer;
            }
        }

        if(answer.length() == 0) return "-1";
        if(answer.charAt(0) == '0') return "0";



        // 시간초과 문제

//         int length = X.length() > Y.length() ? X.length() : Y.length();

//         // 중복 숫자 뽑아내기
//         for(int i = 0; i < X.length(); i++){
//             int count = 0;
//             for(int j = 0 ; j < Y.length(); j++){
//                 if(X.charAt(i) == Y.charAt(j)) {
//                     answer+= X.charAt(i) + " ";
//                     X = X.substring(0, i)+ " " + X.substring(i+1);
//                     Y = Y.substring(0, j)+ " " + Y.substring(j+1);
//                 }
//             }
//         }

//         answer = answer.replace(" ", "");

//         if(answer.length() == 0) return "-1";

//         for(int i = 0; i < answer.length(); i++){
//             for(int j = 0; j < answer.length(); j++){
//                 if(answer.charAt(i) > answer.charAt(j)){
//                     char tmp = answer.charAt(i);
//                     answer = answer.substring(0,i) + answer.charAt(j) + answer.substring(i+1);
//                     answer = answer.substring(0,j) + tmp + answer.substring(j+1);
//                 }
//             }
//         }

//         if(answer.charAt(0) == '0') return "0";

        return answer;
    }
}