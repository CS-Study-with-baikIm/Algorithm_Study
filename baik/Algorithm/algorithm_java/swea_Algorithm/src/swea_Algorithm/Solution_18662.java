package swea_Algorithm;

import java.util.Scanner;

public class Solution_18662 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            double[] arr = new double[3];
            
            for(int i = 0; i < 3; i++) {
                arr[i] = sc.nextDouble();
            }
		
            double ans = Math.abs((arr[2] + arr[0]) / 2.0 - arr[1]);
            
            System.out.printf("#%d %.1f\n", test_case, ans);

		}

		sc.close();	
	}
}

