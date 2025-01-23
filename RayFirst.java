//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Jude Armstrong
//Date -

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		if (ray.length == 0)
        {
            return false;
        }

        for (int k = 1; k < ray.length; k++)
        {
            if (ray[k] == ray[0])
            {
                return true;
            }
        }
        return false;
	}
}
