class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            int tmp = 0;
            int count = i;
            while(tmp < n){
                tmp += count;
                count++;
            }
            if(tmp==n) {
                answer++;
                System.out.println(i);
            }
        }

        return answer;
    }
}