// 1
class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0 ;i < k;i++){
            answer += my_string;
        }
        return answer;
    }
}


// 2
class Solution {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
