
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
            long answer = -1;
            long num1 = sc.nextLong();
            long num2 = sc.nextLong();
            long diff = num2 - num1;

            if(diff > 1 ) answer = diff/2;
            if(diff == 0) answer = 0;

            System.out.printf("#%d %d\n",test_case, answer);

        }
    }
}