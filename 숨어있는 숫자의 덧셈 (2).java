class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "";
        for (int i = 0 ; i < my_string.length() ; i++){
            if (Character.isDigit(my_string.charAt(i))){
                temp += String.valueOf(my_string.charAt(i));
            } else {
                if (temp != ""){
                    answer += Integer.parseInt(temp);
                    temp ="";
                }
            }
        }
        if (temp != ""){
          answer += Integer.parseInt(temp);
          temp ="";
          }
        return answer;
    }
}
