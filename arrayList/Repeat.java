package arrayList;
import java.util.*;
public class Repeat {

	public static void main(String[] args) {
		
     int arr[] = {3,1,2,5,3};
//     repeatedNumber(Arrays.asList(arr));
	}
	public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        
        long  n=(long)A.size();
        long  s= (n * (n+1))/2;
        long  p= (n*(n+1)*(2*n+1))/6;
       
        long  missingNumber =0 , repeating =0;
       
       for(int i=0; i<n; i++)
       {
           s = s-(long)A.get(i);
           p = p-(( long )A.get(i) * ( long )A.get(i));
       }
       
       missingNumber= (s + p/s)/2;
       repeating = missingNumber - s;
       
       ArrayList <Integer> ar = new ArrayList<>();
       ar.add((int)repeating);
       ar.add((int)missingNumber);
       
       return ar;
   }

}
