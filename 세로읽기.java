class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String tmp = "";
        int cnt = 1;
        for(int i = 0; i < my_string.length()/m; i++) {
            tmp = my_string.substring(i*m,i*m+m);
            answer += tmp.charAt(c-1);
        }
        return answer;
    }
}
