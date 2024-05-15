package swea_Algorithm;

import java.util.Scanner;
import java.util.Arrays;

class Solution_1206
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int building;
            building = sc.nextInt();
            int ans = 0;
            
            int[] stairs = new int[building];
            for(int i = 0;  i < building; i++) {
            	stairs[i] = sc.nextInt();
            } 
            for(int i = 2; i < building - 2; i++) {
                int[] view = new int[4];
                int k = 0;
                for(int j = i - 2; j <= i + 2; j++) {
                    if(i == j) {
                    } else {
                        view[k] = stairs[j];
                        k += 1;
                    }
                }
                int max = Arrays.stream(view).max().getAsInt();
                if (max < stairs[i]) {
                    ans += stairs[i] - max;
                }
            }
            
            System.out.printf("#%d %d\n", test_case, ans);
		}
	}
}