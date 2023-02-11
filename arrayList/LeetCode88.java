package arrayList;

import java.util.Arrays;

public class LeetCode88 {
	
	public static void main(String args[])
	{
		int num1[] = {1,2,3,0,0,0};
		int num2[] = {2,5,6};
		
		int res[] = merge(num1 ,num2,3,3);
		for(int z: res)
		{
			System.out.println(z);
		}
	}

	
	public static int[] merge(int []num1 , int[] num2 , int m , int n)
	{
		
		
		for(int i=m; i<m+n ;i++)
		{
			int j=0;
			num1[i] = num2[j];
			j++;
		}
		Arrays.sort(num1);
		return num1;
	}

}
