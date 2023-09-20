package lib;

public class Converter {
	
	public static double kmTomile(int distance)
	{
		double tomile=distance*0.621;
		return tomile;
	}
	
	public static int cToF(int temp)
	{
		int toFarhenheit=(temp*9/5)+32;
		return toFarhenheit;
	}
	
	public static int fToc(int temp)
	{
		int tocelcius=(temp-32)*5/9;
		return tocelcius;
	}

}
