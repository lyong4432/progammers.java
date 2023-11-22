class Solution {
    public int solution(int order) {
        int answer = 0;
        String tmp = String.valueOf(order);
        for ( char c : tmp.toCharArray()){
            if (c == '3' || c == '6' || c =='9')
                answer += 1;
        }
        return answer;
    }
}
