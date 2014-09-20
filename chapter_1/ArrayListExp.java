package chapter_1;

import java.util.ArrayList;

public class ArrayListExp {
	
	//Merge 2 ArrayList of words
	public ArrayList<String> merge (String[] words, String[] more) {
		ArrayList<String> sentence = new ArrayList<String>();
		for(String w : words) sentence.add(w);
		for(String w : more) sentence.add(w);
		for(String w : sentence) {
			System.out.print(w + " ");
		}
		System.out.println();
		return sentence;
	}
}
