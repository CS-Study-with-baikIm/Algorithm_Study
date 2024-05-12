import java.util.Scanner;

class Solution_20934
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            String str;
            str = sc.next();

            int bell;
            if (".o.".equals(str)) {
                bell = 1;
            } else if ("o..".equals(str)) {
                bell = 0;
            } else {
                bell = 2;
            }
            int count = sc.nextInt();

            for(int i = 0; i < count; i ++) {
                if (bell > 0) {
                    bell -= 1;
                } else {
                    bell += 1;
                }
            }

            System.out.printf("#%d %d\n", test_case, bell);

        }
    }
}