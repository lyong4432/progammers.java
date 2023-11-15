class Solution {
    public int solution(int a, int b) {
        int answer = 0;
       
        answer = Integer.valueOf(Integer.toString(a)+Integer.toString(b));
        if (answer < Integer.valueOf(Integer.toString(b)+Integer.toString(a)))
            answer = Integer.valueOf(Integer.toString(b)+Integer.toString(a));
        return answer;
    }
}
