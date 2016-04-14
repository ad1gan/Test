
public class Fibonacci {
	public static int recfib(int n)
	{
		if(n == 1 || n == 0)
			return 1;
		
		return recfib(n-1) + recfib(n-2);
	}
	
	public static int itfib(int n)
	{
		int[] res = new int[n+1];
		res[0] = 1;
		res[1] = 1;
		
		for(int i = 2; i <= n; i++)
		{
			res[i] = res[i-1] + res[i-2];
		}
		
		return res[n];
	}
}
