class Solution {
    public int[] solution(int start, int end) {
        int leng = start - end + 1;
        int[] answer = new int[leng];
        for (int i = 0 ; i < leng; i++) {
            answer[i] = start--;
        }
        return answer;
    }
}
