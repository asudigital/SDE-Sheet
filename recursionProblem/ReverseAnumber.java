package recursionProblem;

public class ReverseAnumber {
	
    static int rev(int N , int rev)
    {
        if (N == 0)
        return rev;
        return rev(N/10 , rev*10 + N%10);
        
    }

	public static void main(String[] args) {
	int N =101;
	int rev =0;
// int ans = rev(101 , 0);
 System.out.println(rev(101 , 0));
	}

}
