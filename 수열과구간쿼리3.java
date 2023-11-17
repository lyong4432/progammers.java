class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // int[] answer = arr;
        int a,b,tmp;
        for(int i = 0 ; i < queries.length;i++) {
           a = queries[i][0];
            b = queries[i][1];
            tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        
        }
        return arr;
    }
}
