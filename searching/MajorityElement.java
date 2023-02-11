package searching;

public class MajorityElement {

	public static void main(String[] args) {
		int a[] = {1 , 5, 2 , 5 , 5};
		int ansIndex =0;
		int count =0;
		int majority = count;
		int ans =0;
		
		while(ansIndex < a.length) 
		{
			
		for(int i=0 ; i< a.length ; i++)
		{
			if(a[ansIndex] == a[i])
			{
				count ++;
			}
			if(count > majority)
			{
				majority = count;
				ans = a[ansIndex];
			}
		}
		ansIndex++;
		}
 System.out.println(ans);
	}

}
