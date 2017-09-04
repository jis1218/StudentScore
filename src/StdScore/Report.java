package StdScore; //package에는 보통 도메인 이름을 쓴다. 왜냐하면 도메인은 중복되지 않으므로

import java.util.Scanner;

public class Report {
	
	
	
	public static void main(String args[]){ //문자열을 받기 위해서 들어간다.
		
		int stdID = 0; //학생 번호
		String[] stdName = new String[10]; //학생 이름을 담을 크기가 10인 String Array 변수를 만듦
		
		/*학생 점수를 담을 크기가 10과 3인 2차 int Array 변수를 만듦, 두번째 배열에는 국어, 영여, 수학 점수가 들어감.
		ex)score[0][0]은 국어점수, [0][1]은 영어점수, [0][2]는 수학점수*/
		int[][] score = new int[10][3]; 
		
	  
		Scanner sc = new Scanner(System.in);
		
		//학생 수가 10이 될 때까지 반복
		while(stdID<10){
			
			firstDisplay(); //초기 화면을 띄어주는 함수
			
			int chosenNum = sc.nextInt(); //1번 또는 2번을 선택하게 하는 변수를 만듦
			
			switch(chosenNum){
			
			case 1:
				inputStdScore(stdID, stdName, score);
				stdID++;
				break;
			case 2:
				outputStdScore(stdID, stdName, score);
				break;
				
			default :
				System.out.println("번호를 잘못 입력하였습니다.");
				
			}
		}
	}
	
	//초기 화면을 띄어주는 함수를 만듦
	public static void firstDisplay(){
		System.out.println("성적 관리 프로그램");
		System.out.println("--------------------------------");
		System.out.println("1. 학생정보 입력\n2. 학생정보 출력");
		System.out.println("--------------------------------");
		System.out.println("원하는 번호를 입력하세요 : ");
		System.out.println("--------------------------------");
		
	}
	
	
	//성적을 입력하게 하는 함수를 만듦, 파라미터로 학생수와 학생 이름, 점수를 받는다.
	public static void inputStdScore(int stdID, String[] stdName, int[][] score){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println((stdID+1) + "번째 학생의 성적을 입력합니다.");
		System.out.print("이름 : ");
		stdName[stdID] = sc.next();
		System.out.print("국어점수 : ");
		score[stdID][0] = sc.nextInt();	//두번째 배열이 0일 경우 국어 점수를 받음	
		System.out.print("영어점수 : ");
		score[stdID][1] = sc.nextInt(); //두번째 배열이 1일 경우 영어 점수를 받음
		System.out.print("수학점수 : ");
		score[stdID][2] = sc.nextInt(); //두번째 배열이 2일 경우 수학 점수를 받음
		System.out.println("\n");
		
		
		
	}

	
	//성적을 출력하는 함수를 만듦, 파라미터로 학생수와 학생 이름, 점수를 받는다.
	public static void outputStdScore(int stdID, String[] stdName, int[][] score){
		
		int[] total = {0, 0, 0}; //국어, 영어, 수학 점수의 총점을 저장할 변수를 하나 만든다.
		
		System.out.println("성적출력\n");
		
		//입력한 학생 수만큼 점수를 출력해줄 수 있도록 for문을 이용한다.
		for(int i=0; i<stdID; i++){
		System.out.println("학생이름 : " + stdName[i]);
		System.out.println("번호 : " + (i+1));
		System.out.println("국어점수 : " + score[i][0]);
		System.out.println("영어점수 : " + score[i][1]);
		System.out.println("수학점수 : " + score[i][2] +"\n");
		
		total[0] = total[0] + score[i][0];
		total[1] = total[1] + score[i][1];
		total[2] = total[2] + score[i][2];		
		}
		
		
		//평균을 출력해준다. 평균은 총점에서 학생 수만큼 나눈다.
		System.out.println("--------------------------------");
		System.out.println("과목평균");
		System.out.println("--------------------------------");
		System.out.println("국어평균 : " + ((double)total[0]/(stdID)));
		System.out.println("영어평균 : " + ((double)total[1]/(stdID)));
		System.out.println("수학평균 : " + ((double)total[2]/(stdID)));
		System.out.println("\n");
		
	}
	

}


