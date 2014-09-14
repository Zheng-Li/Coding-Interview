package chapter_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Start input
		Scanner scanner = new Scanner (System.in);
		
		//Check sentence has unique characters
		System.out.println("Check Sentence Uniqueness:");
		String input = scanner.nextLine();
		UniqueCharacter uc = new UniqueCharacter();
		System.out.println(uc.checkUnique(input));
		
		//Check sentences as permutation
		System.out.println("Check Sentence permutation:");
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		Permutation pm = new Permutation();
		System.out.println(pm.permutation(s1, s2));
		
		//Replace all the spaces with "%20"
		System.out.println("Show a sample sentence:");
		String sp = scanner.nextLine();
		ReplaceSpaces rp = new ReplaceSpaces();
		System.out.println(rp.replaceSpace(sp));
		
	}
}
