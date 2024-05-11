
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            int s = sc.nextInt();
            int t = sc.nextInt();

            String[] strS = new String[s];
            String[] strT = new String[t];


            for(int i = 0; i < s; i++){
                strS[i] = sc.next();
            }
            for(int i = 0; i < t; i++){
                strT[i] = sc.next();
            }

            int n = sc.nextInt();

            String answer = "";

            for(int i = 0; i < n; i++){
                int num = sc.nextInt();
                answer = answer + strS[(num - 1)%s] + strT[(num - 1) %t ] + " ";
            }

            System.out.println("#" + test_case+ " "  + answer);

        }
    }
}