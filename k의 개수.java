class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int n = i ; n <= j ; n++){
            String strN = Integer.toString(n);
            String strK = Integer.toString(k);
            
            
            if (strN.contains(strK)) {
                int count = strN.length() - strN.replace(strK,"").length();
                answer += count; 
            }
        }
        return answer;
    }
}
