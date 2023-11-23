import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] tmp = my_string.toCharArray();
        Arrays.sort(indices);
        int j = 0;
        for (int i = 0 ; i < tmp.length; i++) {
            if (i == indices[j] ) {
                if (j < indices.length-1)
                    j++;
                
            } else answer += Character.toString(tmp[i]);
        }
        return answer;
    }
}
