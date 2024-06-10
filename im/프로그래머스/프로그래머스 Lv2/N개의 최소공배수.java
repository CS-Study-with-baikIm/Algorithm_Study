import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);

        int answer = arr[arr.length-1];
        for(int i = arr.length-2; i >=0; i--){
            answer = lcm(arr[i], answer);
        }

        return answer;
    }
    public int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b%a, a);
    }

    public int lcm(int a, int b){
        return a * b /gcd(a, b);
    }
}