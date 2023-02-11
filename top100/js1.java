package top100;
import java.util.*;
public class js1 {

	public static void main(String args[]){
		String s = "javascriptloops";
		capitalSmall(s);
	}
	public static void capitalSmall(String s) {
		String  vow = "aeiou";
		for(int i=0; i<s.length();i++)
		{
			if (vow.indexOf(s.charAt(i)) > -1)
			{
				System.out.println(s.charAt(i));
			}
		}
		
		for(int i=0; i<s.length();i++)
		{
			if (vow.indexOf(s.charAt(i)) < 0)
			{
				System.out.println(s.charAt(i));
			}
		}
	}
}
