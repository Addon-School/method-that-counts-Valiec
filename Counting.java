public class Counting {
	public static void main(String[] args)
	{
		boolean isMax = false;
		int max = -1; //infinity
		if(args.length > 0)
		{
			max = Integer.parseInt(args[0]);
			isMax = true;
		}
		int i = 1;
		while(i <= max || !isMax)
		{
			System.out.println(i);
			i++;
		}
	}
}