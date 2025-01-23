//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jude Armstrong
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
        int min = ray[0];
        for (int k = 0 ; k < ray.length ; k++)
        { 
            if (ray[k] < min)
            {
                min = ray[k];
            }
        }
		return min;
	}
}
