class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {GCD(n,m), LCM(n, m) };
        return answer;
    }

    public int GCD(int a, int b){

        if(b == 0) return a;
        return GCD(b, a%b);
    }


    public int LCM(int a, int b){
        return a*b/GCD(a, b);
    }
}