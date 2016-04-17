
public class StartFib extends Fibonacci{
	
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]);
		System.out.println(recfib(n));
		System.out.println(itfib(n));
	}

}