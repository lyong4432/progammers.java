class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int tmp = 0;
        for (int i = 0; i < num_list.length; i++){
            if ((i+1)%2==0) answer += num_list[i];
            else tmp +=num_list[i];
        }
        if (answer < tmp) answer = tmp;
        return answer;
    }
}
