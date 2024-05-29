class Solution {

    static int length;

    public int solution(int n) {
        // int tmp = n+1;
        // while(n > 0){
        //     binary = n%2 + binary;
        //     n /= 2;
        // }

        String nBinary = Integer.toBinaryString(n);

        length = nBinary.replace("0", "").length();
        int tmp = n+1;
        while(!binaryOneCheck(tmp)) tmp++;

        return tmp;
    }

    public boolean binaryOneCheck(int num){
        String numBinary = Integer.toBinaryString(num);

        int numLength = numBinary.replace("0", "").length();

        return (length == numLength);

    }
}