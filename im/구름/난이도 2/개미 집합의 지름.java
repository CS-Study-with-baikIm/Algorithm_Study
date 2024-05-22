import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 마리
        int D = sc.nextInt(); // 지름


        // 배열에 담기
        int[] arr = new int[(int)N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        // 정렬
        Arrays.sort(arr);

        // 투 포인터
        int begin = 0;
        int end = 0;
        int maxAnts = 0;

        while(begin< N && end < N){
            int length = arr[end] - arr[begin];
            int numOfAnts = end - begin + 1;

            if(length <= D){
                if(maxAnts < numOfAnts) maxAnts = Math.max(maxAnts, numOfAnts);
                end++;
            }
            else{
                begin++;
            }
        }


        System.out.println(N - maxAnts);
    }
}