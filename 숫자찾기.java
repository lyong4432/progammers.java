class Solution {
    public int solution(int num, int k) {
        String n = String.valueOf(num);
        int answer = n.indexOf(String.valueOf(k));
        if (answer != -1) answer++;
        
        return answer;
    }
}
