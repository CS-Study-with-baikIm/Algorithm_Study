class Solution
{
    public int solution(int n, int a, int b)
    {

        //n명 참가, a번째 나, b번째 상대 언제만나는지 궁금
        int answer = 1;

        if(a%2 == 1) a++;
        if(b%2 == 1) b++;
        while(a != b){
            a/=2;
            b/=2;
            if(a%2 == 1) a++;
            if(b%2 == 1) b++;
            answer++;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}