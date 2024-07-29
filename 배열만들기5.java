import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        int arrLength = intStrs.length;
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arrLength ; i++){
            int strLength = intStrs[i].length();
            int temp = Integer.parseInt(intStrs[i].substring(s,s+l));
            if (temp > k){
                answer.add(temp);
            }
        }
        return answer;
    }
}
