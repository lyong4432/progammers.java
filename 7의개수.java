class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0 ; i < array.length ; i++){
            String str = Integer.toString(array[i]);
            answer += str.length() - str.replace("7","").length();
        }
        return answer;
    }
}
