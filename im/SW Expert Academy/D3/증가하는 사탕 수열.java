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
            int answer = 0;
            int[] box = new int[3];
            for(int i = 0; i < 3; i++)
            {
                box[i] = sc.nextInt();
            }

            while(box[2] <= box[1]){
                box[1]--;
                answer++;
            }

            while(box[1] <= box[0]){
                box[0]--;
                answer++;
            }

            for(int i = 0; i < 3; i++){
                if(box[i] < 1)  {
                    answer = -1;
                }
            }

            System.out.println("#"+test_case + " " + answer);


        }
    }
}