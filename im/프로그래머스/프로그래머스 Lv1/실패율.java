class Solution {
    public int[] solution(int N, int[] stages) {

        /*
            1스테이지 부터 실패율을 담을 double형 배열 만들기
            1스테이지 부터 계산하기
            성공율 = 현재 스테이지와 같거나 높으면 분자 / 분모에 +1, 현재 스테이지 보다 높으면 분모 +1
            실패율 = 1 - 성공율
            높은 순서로 소팅하기

        */

        double[] fault = new double[N];
        int[] answer = new int[N];

        for(int i = 0; i < N; i++ ){
            int mom = 0;
            int son = 0;
            for(int j = 0; j < stages.length; j++ ){
                if(i <= stages[j] -1 ) mom++;
                if(i < stages[j] - 1) son++;
            }
            fault[i] = 1 - (double)son/mom;
            answer[i] = i+1;
            System.out.println(son + "/" + mom + "=" +fault[i]);

        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(fault[i] > fault[j]) {
                    int tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;

                    double tmp2 = fault[i];
                    fault[i] = fault[j];
                    fault[j] = tmp2;
                }
                if(fault[i] == fault[j]) {
                    if(answer[i] < answer[j]){
                        int tmp = answer[i];
                        answer[i] = answer[j];
                        answer[j] = tmp;

                        double tmp2 = fault[i];
                        fault[i] = fault[j];
                        fault[j] = tmp2;
                    }

                }
            }
        }
        return answer;
    }
}