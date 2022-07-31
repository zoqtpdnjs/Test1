package test.solution1;

public class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        int[] result = new int[3];

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == person1[i%5]){
                result[0]++;
            }

            if(answers[i] == person2[i%8]){
                result[1]++;
            }

            if(answers[i] == person3[i%10]){
                result[2]++;
            }
        }

        int highScore = 0; // 제일 많이 맞춘 갯수
        for(int i = 0; i < 3; i++){
            if(result[i] > highScore){
                highScore = result[i];
            }
        }

        int count = 0; // 가장 높은 점수를 받은 사람이 여러명인 경우
        for(int i = 0; i < 3; i++){
            if(result[i] == highScore){
                count++;
            }
        }

        answer = new int[count];
        int idx = 0;
        for(int i = 0; i < 3; i++){
            if(result[i] == highScore){
                answer[idx++] = i + 1;
            }
        }

        return answer;
    }
}
