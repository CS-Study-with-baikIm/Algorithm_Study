
import java.util.Scanner;
import java.util.Arrays;

class Solution_20728
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {

            int pocket = sc.nextInt();
            int pick = sc.nextInt();
            int min;
            int[] candies = new int[pocket];

            // 주머니 입력
            for(int i = 0; i < pocket; i++){
                candies[i] = sc.nextInt();
            }

            Arrays.sort(candies);

            min = candies[pick - 1] - candies[0];

            for(int i = 0; i <= candies.length - pick; i++){
                if (candies[i + pick - 1] - candies[i] < min) {
                    min = candies[i + pick - 1] - candies[i];
                }
            }

            System.out.printf("#%d %d\n", test_case, min);
        }
    }
}