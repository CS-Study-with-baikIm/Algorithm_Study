import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] str = input.split(" ");
        int answer = 0;
        for(String s : str){
            answer += Integer.parseInt(s);
        }

        System.out.println(answer);
    }
}