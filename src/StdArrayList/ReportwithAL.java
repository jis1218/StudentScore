package StdArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ReportwithAL {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Studuent student = new Studuent();
		ArrayList<Studuent> arraylist = new ArrayList<>();
		
		while(true){
			System.out.println("���� �Է��Ͻÿ� : ");
			int a = sc.nextInt();
			
			switch(a){
			
			//�Է� �޴� ��
			case 1:
				
				System.out.print("�̸� �Է� : ");
				student.name = sc.next();
				System.out.print("�������� �Է� : ");
				student.korean_score = sc.nextInt();
				System.out.print("�������� �Է� : ");
				student.math_score = sc.nextInt();
				
				arraylist.add(student);
				
				break;
				
				
			case 2:
				for(int i=0; i<arraylist.size(); i++){
				System.out.println(arraylist.get(i).name); //get�� �� �ּҰ��� �ҷ����� ������ ���� ��ġ�� ��
				System.out.println(arraylist.get(i).korean_score);
				System.out.println(arraylist.get(i).math_score);
				}
				
				break;
				
				
			
			}
			
	
		}
		
		
	}
}
