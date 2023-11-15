import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        int tmp = 0;
        for(int i = 0; i< a.length();i++){
            tmp = (int)a.charAt(i);
            if ((65<=tmp)&&(tmp<=90))
                answer += (char)(tmp+32);
            else if ((92<=tmp)&&(tmp<=122))
                answer += (char)(tmp-32);
        }
        System.out.println(answer);
    }
}
