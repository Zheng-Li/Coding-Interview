package chapter_1;

public class Reverse {
	public String reverse(String str) {
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
}

/*This part contains the C/C++ method of same function
 * void reverse(char *str) {
 * 	char* end;
 *  char tmp;
 *  
 * 	if(str){
 *  	while(*end) {
 *  		++end;
 *  	}
 *  	--end;
 *  	
 *  	while(str < end) {
 *  		tmp = *str;
 *  		*str++ = *end;
 *  		*end-- = tmp;
 *  	}
 *  }
 * }
 *
 */ 
