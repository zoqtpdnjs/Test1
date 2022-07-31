package test.solution2;

public class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0, aSize = a.length; i < aSize; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}
