
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num = sc.nextInt();
            int length = sc.nextInt();

            boolean isP = false;

            String[] strArr = new String[num];

            int answer = 0;

            for(int i = 0; i < num; i++){
                strArr[i] = sc.next();
                StringBuffer sb = new StringBuffer(strArr[i]);
                String reverse = sb.reverse().toString();
                if(strArr[i].equals(reverse) ) isP = true;
                else{
                    for(int j = 0; j < i; j++){
                        if(strArr[j].equals(reverse)) answer += length*2;
                    }
                }
            }

            if(isP) answer += length;

            System.out.println("#" + test_case + " " + answer);

        }
    }
}