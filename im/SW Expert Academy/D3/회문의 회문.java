
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
            String str = sc.next();
            String strForward = str.substring(0, (str.length()-1)/2 );
            String strBack = str.substring((str.length()-1)/2 + 1 );


            if( check(str) && check(strForward) && check(strBack) ) System.out.println("#" + test_case+ " YES");
            else System.out.println("#" + test_case+ " NO");

        }
    }

    public static boolean check(String str){
        String backword = "";

        for(int i = 0; i < str.length(); i++){
            backword += str.charAt(str.length()-1-i);
        }

        if(str.equals(backword)) return true;
        else return false;
    }
}