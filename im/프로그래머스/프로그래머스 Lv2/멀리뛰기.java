class Solution {

    public long solution(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        long answer = 0;

        long f1 = 1;
        long f2 = 2;

        for( int i = 3; i <= n; i++){
            answer = f1 + f2;
            f1 = f2;
            f2 = answer % 1234567;
        }


        return answer % 1234567;
    }
}