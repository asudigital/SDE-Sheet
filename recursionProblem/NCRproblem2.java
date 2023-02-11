package recursionProblem;

public class NCRproblem2 {

	  static int nCr(int N, int r)
	  {
	    int res = 0;
	    if (r == 0) {
	      return 1;
	    }
	     
	      res = nCr(N, r - 1) * (N - r + 1) / r;
	    
	    return res;
	  }
	 
	  public static void main(String[] args)
	  {
	    int N = 5, r = 3;
	 
	    System.out.println(nCr(N, r));
	  }
	
}
