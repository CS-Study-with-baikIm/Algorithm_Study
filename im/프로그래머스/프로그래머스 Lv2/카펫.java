class Solution {
    public int[] solution(int brown, int yellow) {


        // 가로 길이 >= 세로 길이
        // [가로 , 세로]
        // 세로는 3부터
        // 테두리는 한 줄 이었다......

        int sum = brown + yellow;


        return search(brown, yellow, sum);
    }

    public static int[] search(int b, int y, int s){
        int height = 0;
        int width = 0;

        for(int i = 3; i <= s/2; i++){
            if(height != 0) break;
            // 홀수일때 1357 자기보다 2 작은것 까지
            if(i%2 == 1){
                for(int j = 1; j <= i-2; j++){
                    int x = s/i;
                    // System.out.println(i + " 홀 " + j + (x-2));
                    if(j*(x-2) == y){
                        height = i;
                        width = x;
                    }
                }
            }
            // 짝수 일 때 2468 자기보다 2 작은것 까지
            if(i%2 == 0){
                for(int j = 2; j <= i-2; j++){
                    int x = s/i;
                    // System.out.println(i + " 짝 " + j + (x-2));
                    if(j*(x-2) == y){
                        height = i;
                        width = x;
                    }
                }
            }
        }


        int[] answer = {width, height};
        return answer;
    }
}