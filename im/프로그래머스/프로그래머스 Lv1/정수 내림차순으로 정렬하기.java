import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = "" + n;
        String[] arr = str.split("");
        Arrays.sort(arr);
        String tmp = "";

        for(int i = 0; i < arr.length; i++){
            tmp = arr[i]+tmp;
        }
        System.out.println(Arrays.toString(arr));
        return Long.parseLong(tmp);
    }
}