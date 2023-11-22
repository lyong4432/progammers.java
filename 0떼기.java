class Solution {
    public String solution(String n_str) {
        String answer = "";
        int i = 0;
        for (char c : n_str.toCharArray()){
            if (c == '0') i += 1;
            else break;
        }
        answer = n_str.substring(i);
        return answer;
    }
}
