package twoDimensionArrayList;
import java.util.*;
public class ddArrayList {

	
	  public static void main(String[] args) {
	        List<List<Integer>> twoDim = new ArrayList<>();

	        List<Integer> odd = new ArrayList<>();
	        odd.add(1);
	        odd.add(3);
	        odd.add(5);

	        List<Integer> even = new ArrayList<>();
	        even.add(2);
	        even.add(4);

	        List<Integer> palindrone = new ArrayList<>();
	        palindrone.add(121);
	        palindrone.add(12121);

//	         System.out.println(even);
	         twoDim.add(odd);
	         twoDim.add(even);
	         twoDim.add(palindrone);
	         System.out.println(twoDim);

	    }
}
