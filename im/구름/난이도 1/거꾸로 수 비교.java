import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split(" ");

        String firstBack = new StringBuffer(arr[0]).reverse().toString();
        String secondBack = new StringBuffer(arr[1]).reverse().toString();

        int fb = Integer.parseInt(firstBack);
        int sb = Integer.parseInt(secondBack);

        if(fb > sb) System.out.println(arr[0]);
        else System.out.println(arr[1]);
    }
}