package chapter_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/* This is the test for 3 datatype:
			hashmap_test();
			arraylist_test();
			stringbuffer_test();
		*/
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
	
	public static void hashmap_test() {
		HashMapExp hme = new HashMapExp();
		Student a = new Student(9527, "Lee");
		Student b = new Student(9528, "Max");
		Student c = new Student(9529, "Qian");
		Student d = new Student(9530, "Yong");
		Student[] students = new Student[]{a, b, c, d};
		hme.buildMap(students);
		hme.useMap();
	}
	
	public static void arraylist_test() {
		ArrayListExp ale = new ArrayListExp();
		String[] str1 = {"What", "the", "fuck"};
		String[] str2 = {"am", "I", "doing", "now", "!!!"};
		ale.merge(str1, str2);
	}
	
	public static void stringbuffer_test() {
		StringBufferExp sbe = new StringBufferExp();
		String[] words = {"What", "the", "fuck", "is", "it", "?"};
		sbe.joinWords(words);
	}
	
	public static void question_1(Scanner scan) {
		//Check sentence has unique characters
		System.out.println("Check Sentence Uniqueness:");
		String input = scan.nextLine();
		UniqueCharacter uc = new UniqueCharacter();
		System.out.println(uc.checkUnique(input));
	}
	
	public static void question_2(Scanner scan) {
		//reverse a string in C++/Java
		System.out.println("Reverse the string: ");
		String input = scan.nextLine();
		Reverse reverse = new Reverse();
		System.out.println(reverse.reverse(input));
	}
	
	public static void question_3(Scanner scan) {
		//Check sentences as permutation
		System.out.println("Check Sentence permutation:");
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		Permutation pm = new Permutation();
		System.out.println(pm.permutation(s1, s2));
	}
	
	public static void question_4(Scanner scan) {
		//Replace all the spaces with "%20"
		System.out.println("Show a sample sentence:");
		String sp = scan.nextLine();
		ReplaceSpaces rp = new ReplaceSpaces();
		System.out.println(rp.replaceSpace(sp));
	}
	
	public static void question_5(Scanner scan) {
		//Compress the String with the counts of the repeated characters
		System.out.println("Show a sample string for compression:");
		String cp = scan.nextLine();
		Compress com = new Compress();
		System.out.println(com.compress(cp));
	}
	
	public static void question_6(Scanner scan) {
		//Rotate a N*N matrix by 90 degrees.
		System.out.println("Give the initial matrix size:");
		int size = Integer.parseInt(scan.nextLine());
		Rotation rot = new Rotation(size);
		int[][] source = rot.get_original_matrix();
		int[][] rotate = rot.clockwise_rotate(source, size);
		int[][] counter_rotate = rot.counter_clockwise_rotate(rotate, size);
	}
	
	public static void question_7(Scanner scan) {
		//Clear the entire row and column when there's 0 in a M*N matrix
		System.out.println("Give me the size of the original matrix(by 'row' and 'column'):");
		int row = Integer.parseInt(scan.next());
		int column = Integer.parseInt(scan.next());
		Clear_zero cz = new Clear_zero(row, column);
		cz.clear();
	}
	
	public static void question_8(Scanner scan) {
		//Check if 2nd string is the rotation of the 1st string
		System.out.println("Give me the First string:");
		String s1 = scan.nextLine();
		System.out.println("Give me the Second string:");
		String s2 = scan.nextLine();
		Substring ss = new Substring();
		if(ss.is_rotation(s1, s2)) {
			System.out.println(s2 + " is rotation of " + s1);
		} else {
			System.out.println(s2 + " is not rotation of" + s2);
		}
	}
}
