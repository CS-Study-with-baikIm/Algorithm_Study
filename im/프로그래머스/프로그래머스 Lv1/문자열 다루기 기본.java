class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        if(s.length() != s.replaceAll("[^0-9]","").length()) return false;

        return true;
    }
}