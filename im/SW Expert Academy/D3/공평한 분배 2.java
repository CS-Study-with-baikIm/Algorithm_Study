
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            int bucket = sc.nextInt();
            int pick = sc.nextInt();
            int[] buckets = new int[bucket];


            // 바구니 담기
            for(int i = 0; i < bucket; i++){
                buckets[i] = sc.nextInt();
            }


            // 순서 정렬
            for(int i = 0; i < bucket; i++){
                for(int j = 0; j < bucket; j++){
                    if(buckets[i] < buckets[j]){
                        int tmp = buckets[i];
                        buckets[i] = buckets[j];
                        buckets[j] = tmp;
                    }
                }
            }

            int answer = buckets[buckets.length-1] - buckets[0];

            for(int i = 0; i <= bucket-pick; i++){
                int num = buckets[i+pick-1] - buckets[i];
                if(num < answer) answer = num;
            }





            // System.out.println("#" + test_case + " " + (buckets[max] - buckets[min]));
            System.out.println("#" + test_case + " " + answer);



        }
    }
}