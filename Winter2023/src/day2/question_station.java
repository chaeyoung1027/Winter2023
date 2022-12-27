package day2;

class Station {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int position = 1;
        int i=0;
        
        while(position<=n){
            if(i<stations.length && position>=stations[i]-w){
                position=stations[i]+w+1;
                i++;
            }else{ //������ ��ġ
                answer+=1;
                position+=w+w+1;
            }
        }
        return answer;
    }
}

public class question_station {

	public static void main(String[] args) {
		int n = 11; //����Ʈ�� ����
		int stations[] = {4, 11};	//4g�� �ִ� ����Ʈ�� ��ġ
		int w = 1;	//��Ʈ ����
		
		Station solution = new Station();
		System.out.println(solution.solution(n, stations, w));
		
	}

}
