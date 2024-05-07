class Solution {
    public int solution(int n) {


        if( n == 0 ) return 0;
        if( n == 1 ) return 1;

        long f1 = 0;
        long f2 = 1;
        long f3 = f2 + f1;

        for(int i = 0; i < n-2; i++){

            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
            f3 %= 1234567;
        }


        return (int)(f3 % 1234567);
    }
}