import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int n = intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] +2;
        int[] answer = new int[n];
            // Arrays.copyOfRange(arr,intervals[0][0],intervals[0][1])  + Arrays.copyOfRange(arr,intervals[1][0],intervals[1][1]);
        int j = 0;
        for (int i= intervals[0][0] ; i <= intervals[0][1]; i++) {
           answer[j++] = arr[i];
        }
        for (int i= intervals[1][0] ; i <= intervals[1][1]; i++) {
           answer[j++] = arr[i];
        }
        
            return answer;
    }
}
