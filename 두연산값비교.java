class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int n1= Integer.parseInt(""+a+b);
        int n2 = 2 * a * b;
        answer = n1> n2 ? n1 : (n1 == n2?n1:n2);
        return answer;
    }
}
