class Solution {
    public int solution(String word) {
        int answer = 0;
        int[] gap = {781, 156, 31, 6, 1};
        int[] start = {1, 2, 3, 4, 5};
        for(int i = 0; i < word.length(); i++){
            answer += 1;

            switch(word.charAt(i)){
                case 'E' :
                    answer += gap[i] ;
                    break;
                case 'I' :
                    answer += gap[i]*2 ;
                    break;
                case 'O' :
                    answer += gap[i]*3 ;
                    break;
                case 'U' :
                    answer += gap[i]*4 ;
                    break;

            }
        }

        return answer;
    }
}