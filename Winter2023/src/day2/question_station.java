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
            }else{ //기지국 설치
                answer+=1;
                position+=w+w+1;
            }
        }
        return answer;
    }
}

public class question_station {

	public static void main(String[] args) {
		int n = 11; //아파트의 갯수
		int stations[] = {4, 11};	//4g가 있는 아파트의 위치
		int w = 1;	//와트 세기
		
		Station solution = new Station();
		System.out.println(solution.solution(n, stations, w));
		
	}

}
