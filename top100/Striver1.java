package top100;
import java.util.*;
public class Striver1 {

	public static void main(String[] args) {
		
		String str = "ABCDDCBA";
        boolean res = isPalindrome(str);
        System.out.println(res);
	}
     
	public static boolean isPalindrome(String str) {
		int n = str.length()-1;
		int start = 0;
		int end = n;
		
		while(start <= end)
		{
			
			if (str.charAt(start) == str.charAt(end))
			{
				start++;
				end--;
			}
			else {
				return false;
			}			
		}
		return true;
		
	}

	private static Object charAt(int end) {
		// TODO Auto-generated method stub
		return null;
	}
}
