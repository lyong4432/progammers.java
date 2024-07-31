class Solution {
    public int solution(int n) {
        int answer = 1;
        int k = 1;
        while (n>=k) {
            k *= answer++;  
        }
        if (k > n) answer-= 2;
        else if (k ==n) answer--;
        return answer;
    }
}
