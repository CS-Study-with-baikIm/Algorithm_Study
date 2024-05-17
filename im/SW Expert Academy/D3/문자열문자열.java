
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
            String str = sc.next();
            String half1 = str.substring(0, n/2);            
            String half2 = str.substring(n/2);
			String answer = half1.equals(half2) ? "Yes" : "No";
            System.out.printf("#%d %s\n",test_case,answer);

		}
	}
}