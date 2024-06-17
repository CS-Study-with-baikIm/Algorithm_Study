
import java.util.Scanner;
import java.io.FileInputStream;

/*
 */
class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        int N;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            N=sc.nextInt();

            System.out.println("#"+N);
            int[] arr = new int[N];
            String str = "";

            for(int i = 0; i < N; i++){
                arr[i] = 1;
            }

            for(int i = 0; i < N; i++)
            {
                str = "";
                for(int j = 0; j <= i; j++){
                    if(j == 0){
                        str += arr[j] + " ";
                    }
                    else if(j == i){
                        str += arr[j];
                    }
                    else{
                        str += arr[j-1] + arr[j] + " ";
                    }

                }
                System.out.print(str);

                String[] tmp = str.split(" ");
                for(int j = 0; j < tmp.length; j++){
                    arr[j] = Integer.parseInt(tmp[j]);
                }
                System.out.println();

            }

        }
    }
}