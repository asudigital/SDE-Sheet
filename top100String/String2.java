package top100String;

public class String2 {

	public static void main(String[] args) {
			int max = 150;
			int min = 100;
           for(int i=min ; i<= max ; i++)
           {
        	   if(isPalindrone(i)) {
        		   System.out.println(i + " ");
        	   }
           }
	}
	public static boolean isPalindrone(int n) {
		int num =n;
		int rev =0;
		
		while (num>0) {
		 rev = rev * 10 + num % 10;
		 num = num/10;
		}
		if(rev == n)
			return true;
		else 
			return false;
		
			
	}

}
