class Solution {
    public int solution(String number) {
        int answer = 0;
        for (char c: number.toCharArray()){
            int a = c -'0';
            answer += a;
        }
        answer %= 9;
        return answer;
    }
}
