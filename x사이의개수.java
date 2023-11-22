class Solution {
    public int[] solution(String myString) {
       myString = myString.replace("x","x "); 
       String[] tmp = myString.split("x");
        
        
       int[] answer = new int[tmp.length];
       for (int i = 0 ; i < tmp.length; i++ ){
           if (i ==0 ) answer[i] = tmp[i].length();
           else    answer[i] = tmp[i].length()-1;
         }
       
        return answer;
    }
}
