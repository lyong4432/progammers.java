class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length > arr2.length) answer = 1;
        else if (arr1.length < arr2.length) answer = -1;
        else {
            int tmp = 0;
            for (int i = 0 ;i<arr1.length;i++) 
            {
                answer += arr1[i];
            }
            for (int i = 0 ;i<arr1.length;i++) 
            {
                tmp += arr2[i];
            }
            if (answer > tmp) answer = 1;
            else if (answer < tmp) answer = -1;
            else answer = 0;
        }
        return answer;
    }
}
