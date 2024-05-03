
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
            int n = sc.nextInt();
            int[] arr = new int[n];

            long answer = 0;


            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int max = arr[n-1];

            for(int i = n-1; i >= 0; i--){
                if(arr[i] > max){
                    max = arr[i];
                }
                else{
                    answer += (max - arr[i]);
                }
            }

            System.out.println("#"+ test_case+ " " + answer);
        }
    }
}