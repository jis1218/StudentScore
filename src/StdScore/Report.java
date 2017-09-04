package StdScore; //package���� ���� ������ �̸��� ����. �ֳ��ϸ� �������� �ߺ����� �����Ƿ�

import java.util.Scanner;

public class Report {
	
	
	
	public static void main(String args[]){ //���ڿ��� �ޱ� ���ؼ� ����.
		
		int stdID = 0; //�л� ��ȣ
		String[] stdName = new String[10]; //�л� �̸��� ���� ũ�Ⱑ 10�� String Array ������ ����
		
		/*�л� ������ ���� ũ�Ⱑ 10�� 3�� 2�� int Array ������ ����, �ι�° �迭���� ����, ����, ���� ������ ��.
		ex)score[0][0]�� ��������, [0][1]�� ��������, [0][2]�� ��������*/
		int[][] score = new int[10][3]; 
		
	  
		Scanner sc = new Scanner(System.in);
		
		//�л� ���� 10�� �� ������ �ݺ�
		while(stdID<10){
			
			firstDisplay(); //�ʱ� ȭ���� ����ִ� �Լ�
			
			int chosenNum = sc.nextInt(); //1�� �Ǵ� 2���� �����ϰ� �ϴ� ������ ����
			
			switch(chosenNum){
			
			case 1:
				inputStdScore(stdID, stdName, score);
				stdID++;
				break;
			case 2:
				outputStdScore(stdID, stdName, score);
				break;
				
			default :
				System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.");
				
			}
		}
	}
	
	//�ʱ� ȭ���� ����ִ� �Լ��� ����
	public static void firstDisplay(){
		System.out.println("���� ���� ���α׷�");
		System.out.println("--------------------------------");
		System.out.println("1. �л����� �Է�\n2. �л����� ���");
		System.out.println("--------------------------------");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� : ");
		System.out.println("--------------------------------");
		
	}
	
	
	//������ �Է��ϰ� �ϴ� �Լ��� ����, �Ķ���ͷ� �л����� �л� �̸�, ������ �޴´�.
	public static void inputStdScore(int stdID, String[] stdName, int[][] score){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println((stdID+1) + "��° �л��� ������ �Է��մϴ�.");
		System.out.print("�̸� : ");
		stdName[stdID] = sc.next();
		System.out.print("�������� : ");
		score[stdID][0] = sc.nextInt();	//�ι�° �迭�� 0�� ��� ���� ������ ����	
		System.out.print("�������� : ");
		score[stdID][1] = sc.nextInt(); //�ι�° �迭�� 1�� ��� ���� ������ ����
		System.out.print("�������� : ");
		score[stdID][2] = sc.nextInt(); //�ι�° �迭�� 2�� ��� ���� ������ ����
		System.out.println("\n");
		
		
		
	}

	
	//������ ����ϴ� �Լ��� ����, �Ķ���ͷ� �л����� �л� �̸�, ������ �޴´�.
	public static void outputStdScore(int stdID, String[] stdName, int[][] score){
		
		int[] total = {0, 0, 0}; //����, ����, ���� ������ ������ ������ ������ �ϳ� �����.
		
		System.out.println("�������\n");
		
		//�Է��� �л� ����ŭ ������ ������� �� �ֵ��� for���� �̿��Ѵ�.
		for(int i=0; i<stdID; i++){
		System.out.println("�л��̸� : " + stdName[i]);
		System.out.println("��ȣ : " + (i+1));
		System.out.println("�������� : " + score[i][0]);
		System.out.println("�������� : " + score[i][1]);
		System.out.println("�������� : " + score[i][2] +"\n");
		
		total[0] = total[0] + score[i][0];
		total[1] = total[1] + score[i][1];
		total[2] = total[2] + score[i][2];		
		}
		
		
		//����� ������ش�. ����� �������� �л� ����ŭ ������.
		System.out.println("--------------------------------");
		System.out.println("�������");
		System.out.println("--------------------------------");
		System.out.println("������� : " + ((double)total[0]/(stdID)));
		System.out.println("������� : " + ((double)total[1]/(stdID)));
		System.out.println("������� : " + ((double)total[2]/(stdID)));
		System.out.println("\n");
		
	}
	

}


