class Solution {
    public int[] solution(int s, int e) {
        int[] answer = new int[e-s+1];
        for (int i = s;i<=e;i++)
        {
            answer[i-s] = i;
        }
        
        return answer;
    }
}
