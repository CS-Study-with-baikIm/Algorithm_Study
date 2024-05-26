class Solution {
    boolean solution(String s) {

        /*
            stack으로 구현할 수 있지만

            count를 이용하여 괄호가 열릴 때 +1 / 닫힐 때 -1
            위와 같은 로직이면 count가 음수이면 false / 최종 값이 0이 아니면 false
            나머지는 true
        */



        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(count < 0) return false;
            if(s.charAt(i) == '(') count++;
            else count--;
        }
        System.out.println(count);

        return count == 0;
    }
}