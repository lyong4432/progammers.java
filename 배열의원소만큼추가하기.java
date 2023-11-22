class Solution {
    public int[] solution(int[] arr) {
        
        int hap = 0;
        for (int i = 0 ; i < arr.length ; i++){
            hap += arr[i];
        }
        int[] answer = new int[hap];
        int cnt = 0;
        for (int i = 0; i < arr.length;i++){
            for (int j = 0 ; j < arr[i] ; j++)
                answer[cnt++] = arr[i]; 
        }
        
        return answer;
    }
}
