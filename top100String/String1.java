package top100String;
import java.util.Scanner;
public class String1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		countVowelsConsonants(str);
	}
	
	public static void countVowelsConsonants(String s) {
		String str = "aeiou";
		int vowels=0 , consonants =0 , whitespace =0;
		for(int i=0; i<s.length(); i++) {	
			
			if(str.indexOf(s.charAt(i)) > -1) {
				vowels++;
			}
		 
			else if(s.charAt(i) == ' ' ) {
				whitespace++;
			}
			else if(s.charAt(i) >= 'a' && s.charAt(i) <='z'){
				consonants++;
			}								
		}
		System.out.println("vowels"+ vowels);
		System.out.println("consonants"+ consonants);
		System.out.println("whitespace"+ whitespace);
	}
}
