package chapter_2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		while(true) {
			
			System.out.println("Choose the question to check:");
			Scanner scan = new Scanner(System.in);
			int num = 0;
			try {
				num = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException efe){
				efe.printStackTrace();
			}
			
			switch(num) {
			case 0: 
				System.out.println("Finish questions");
				return;
			case 1: 
				question_1(scan);
				break;
			case 2: 
				question_2(scan);
				break;
			case 3: 
				question_3(scan);
				break;
			case 4: 
				question_4(scan);
				break;
			case 5:
				question_5(scan);
				break;
			case 6:
				question_6(scan);
				break;
			case 7:
				question_7(scan);
				break;
			case 8:
				question_8(scan);
				break;
			default: 
				System.out.println("Invalid question number!");
				return;
			}
		}
	}
}