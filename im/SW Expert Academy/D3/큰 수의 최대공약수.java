
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

            String num1 = sc.next();
            String num2 = sc.next();
            String answer = num1.equals(num2) ? num1 : "1";
            System.out.printf("#%d %s\n", test_case, answer);

        }
    }
}