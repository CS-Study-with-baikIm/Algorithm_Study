
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;
import java.util.Arrays;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            String[] price = sc.next().split("");
            int n = sc.nextInt();
            int[] arr = new int[price.length];
            int[] sort = new int[price.length];

            for(int i =0; i < price.length; i++){
                arr[i] = Integer.parseInt(price[i]);
                sort[i] = arr[i];
            }
            Arrays.sort(sort);

            for(int i = 0; i < n; i++){
                int index = 0;
                boolean perfect = false;
                while(arr[index] == sort[sort.length - 1 -index]) {
                    if(index == arr.length - 1) {
                        perfect = true;
                        break;
                    }
                    index++;
                }

                if(perfect){
                    if(!isMulti(arr)){
                        int tmp = arr[arr.length-1];
                        arr[arr.length-1] = arr[arr.length-2];
                        arr[arr.length-2] = tmp;
                    }
                }
                else{
                    int largeIndex = arr.length-1;
                    int largeMulti = 0;
                    for(int j = 0; j < arr.length; j++){
                        if(arr[j] == sort[sort.length - 1 - index]) largeMulti++;
                    }

                    while(arr[largeIndex] != sort[sort.length - 1 - index]) {
                        largeIndex--;
                    }

                    if(largeMulti > n-i){

                        for(int j = 0; j <n-i; j++){
                            if(arr[j] < arr[index]) index = j;
                        }
                    }


                    int tmp = arr[largeIndex];
                    arr[largeIndex] = arr[index];
                    arr[index] = tmp;
                }
            }

            String answer = "#" + test_case + " ";
            for(int i = 0; i < arr.length; i++){
                answer += arr[i];
            }
            System.out.println(answer);

        }
    }

    public static boolean isMulti(int[] arr){


        for(int i = 0; i < arr.length; i++){
            int tmp = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]) tmp++;
            }
            if(tmp>1) return true;
        }


        return false;
    }
}