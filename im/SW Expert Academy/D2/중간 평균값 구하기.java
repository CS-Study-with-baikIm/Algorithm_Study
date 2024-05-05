
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

            int[] arr = new int[10];

            int max = 0;
            int min = 10000;
            double sum = 0;
            for(int i = 0; i < 10; i++){
                arr[i] =  sc.nextInt();
                if(arr[i] < min) min = arr[i];
                if(arr[i] > max) max = arr[i];
                sum += arr[i];
            }
            double answer = Math.round((sum -min -max) / 8) ;


            System.out.println("#"+test_case+ " " + (int)answer );

        }
    }
}