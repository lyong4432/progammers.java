import java.util.*;
class Solution {
    public ArrayList solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList();
        int flag = 1;
        for(int i = 0 ; i <arr.length; i++) { 
            flag = 1;
            for (int j = 0 ; j < delete_list.length;j++){
                if(arr[i] == delete_list[j]) {
                    flag = 0;
                    break;
                } 
                
            }
              if (flag == 1) answer.add(arr[i]);  
        }
        return answer;
    }
}
