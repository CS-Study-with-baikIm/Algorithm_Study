class Solution {
    public int solution(String[] babbling) {

        /*
            배열의 문자열에서 조건에 해당하는 문자열을 빼준다.
            공백일 경우 조건에 부합하는 문자열로만 이루어졌다고 판단한다.

            wyeoo의 경우 ye를 빼주면 woo로 바뀌기 때문에 조건에 부합한다고 잘못 판단된다.
            따라서 조건의 문자열을 빼는것이 아니라 " " 공백으로 바꾸고 마지막에 trim()으로 공백만 있는 경우를 제거한다.
        */

        int answer = 0;

        for(int i = 0; i < babbling.length; i++){
            babbling[i]= babbling[i].replace("aya", " ");
            babbling[i]= babbling[i].replace("ye", " ");
            babbling[i]= babbling[i].replace("woo", " ");
            babbling[i]= babbling[i].replace("ma", " ");

            if(babbling[i].trim().length() == 0) answer++;
        }

        return answer;
    }
}