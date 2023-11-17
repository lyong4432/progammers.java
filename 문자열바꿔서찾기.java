class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String newString = myString.replace('A','b').replace('B','A').replace('b','B');
   
        if (newString.contains(pat)) answer = 1;
        return answer;
    }
}
