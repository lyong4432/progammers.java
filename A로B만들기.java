import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a,b)) answer = 1;
        
        return answer;
    }
}
