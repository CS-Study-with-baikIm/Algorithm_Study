
// 처음에 모든 경우의 수를 다 탐색했으나 시간초과
// 일단 둘이 정렬해서 오름차순과 내림차순으로 해보니까 되었다.
// 곱 이기 때문에 크고 작은 순으로 곱하는게 제일 낮을 거 같긴한데 아직도 정확한 이유는 모르겠다.
// 정렬이라면 쉽고, 최솟값 * 최댓값이 풀이인 이유는 생각이 필요할 것 같다.

import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[B.length -1 -i];
        }

        return answer;
    }
}






// 피로도와 같이 전부 다 탐색해서 최솟값을 구했으나 시간 초과나옴 아마 이중반복문을 1000개 돌고 재귀까지 들어가서 그런듯....

/*
class Solution
{
    public boolean[] boolA;
    public boolean[] boolB;

    public int answer;

    public int solution(int []A, int []B)
    {
        boolA = new boolean[A.length];
        boolB = new boolean[B.length];

        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[i];
        }

        function(0, 0, A.length, A, B);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    private void function(int depth, int sum, int length, int[] A, int[] B){
        for(int i = 0; i < A.length; i++){
            if(sum >= answer) break;

            for(int j = 0; j < B.length; j++){

                if(!boolA[i] && !boolB[j] && sum < answer){
                    boolA[i] = true;
                    boolB[j] = true;
                    function(depth+1, sum+(A[i]*B[j]), A.length, A, B);
                    boolA[i] = false;
                    boolB[j] = false;
                }

            }
        }
        if(depth == A.length) answer = answer < sum ? answer : sum;

    }
}

*/