package StdArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ReportwithAL {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Studuent student = new Studuent();
		ArrayList<Studuent> arraylist = new ArrayList<>();
		
		while(true){
			System.out.println("값을 입력하시오 : ");
			int a = sc.nextInt();
			
			switch(a){
			
			//입력 받는 곳
			case 1:
				
				System.out.print("이름 입력 : ");
				student.name = sc.next();
				System.out.print("국어점수 입력 : ");
				student.korean_score = sc.nextInt();
				System.out.print("수학점수 입력 : ");
				student.math_score = sc.nextInt();
				
				arraylist.add(student);
				
				break;
				
				
			case 2:
				for(int i=0; i<arraylist.size(); i++){
				System.out.println(arraylist.get(i).name); //get할 때 주소값을 불러오기 때문에 값이 겹치는 듯
				System.out.println(arraylist.get(i).korean_score);
				System.out.println(arraylist.get(i).math_score);
				}
				
				break;
				
				
			
			}
			
	
		}
		
		
	}
}
