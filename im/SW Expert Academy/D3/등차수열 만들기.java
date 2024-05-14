
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            double[] num = new double[3];
            double answer1 = 0;
            double answer2 = 0;
            double answer3 = 0;

            for(int i = 0; i < 3; i ++){
                num[i] = sc.nextInt();
            }

            // 앞 2개에 맞추기
            answer1 = num[1]*2 - num[0] - num[2];
            if(answer1 < 0) answer1*=-1;

            // 뒤 2개에 맞추기
            answer2 = num[1]*2 - num[2] - num[0];
            if(answer2 < 0) answer2*=-1;

            // 중간것 바꾸기
            answer3 = (num[2]+num[0]) / 2 - num[1];
            if(answer3 < 0) answer3*=-1;

            // 작은수로 바꾸기
            double answer = answer1 < answer2 ? answer1 : answer2;
            answer = answer < answer3 ? answer : answer3;


            System.out.printf("#%d %.1f\n", test_case, answer3);


        }
    }
}