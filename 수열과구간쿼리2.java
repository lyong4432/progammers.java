import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int start, end, target;
        int flag;
        for (int i = 0 ; i < queries.length;i++) {
            flag = 0;
            start = queries[i][0];
            end = queries[i][1];
            target = queries[i][2];
            
            int[] tmp = Arrays.copyOfRange(arr,start,end+1);
            Arrays.sort(tmp);
            
            for(int j = 0; j < tmp.length;j++){
                if (tmp[j]>target) {
                    answer[i] = tmp[j];
                    flag = 1; break;
                }
            }
            if (flag == 0) answer[i] = -1;
        }
        return answer;
    }
}
