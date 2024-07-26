class Solution {
    public int[] solution(long n) {
        String temp = Long.toString(n);
        int[] answer = new int[temp.length()];
        
        char[] array = temp.toCharArray();
        int j = 0;
        for (int i = temp.length()-1 ; i > -1 ; i--) {
            answer[j] = Integer.parseInt(String.valueOf(temp.charAt(i)));
            j++;
        }
        return answer;
    }
}
