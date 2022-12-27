package day2;
import java.util.Arrays;
class Colthes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // ���� ü������ ������ �л��� �������� ���
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        // �������� �л����� ü���� �����ִ� ���
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1; 
                    break; 
                }
            }
        }
        return answer;
    }
}

public class question_WorkoutClothes {

	public static void main(String[] args) {
		Colthes solution = new Colthes();
		int n = 5; //��ü �л���
		int lost[] = {2, 4};	//�������� �л�
		int reserve[] = {1, 3, 5};	//������ �ִ� �л�
		System.out.println(solution.solution(n, lost, reserve));

	}

}
