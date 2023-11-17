import java.util.ArrayList;
class Solution {
    public ArrayList solution(String my_string) {
        String[] stringArray = my_string.split(" ");
        ArrayList<String> answer = new ArrayList<>();

        for (String s : stringArray) {
            if (!s.equals("")) answer.add(s);
        }

        
        return answer;
    }
}
