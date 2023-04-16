public class Counting {
	public static void main(String[] args)
	{
		boolean isMax = false;
		int max = -1; //infinity
		if(args.length > 1)
		{
			System.err.println("error: too many args");
			System.err.println("usage: counting [max]");
			System.exit(1);
		}
		if(args.length > 0)
		{
			max = Integer.parseInt(args[0]);
			isMax = true;
		}
		if(max < 0)
		{
			System.err.println("error: max must be positive");
			System.exit(1);
		}
		int i = 1;
		while(i <= max || !isMax)
		{
			System.out.println(i);
			i++;
		}
	}
}