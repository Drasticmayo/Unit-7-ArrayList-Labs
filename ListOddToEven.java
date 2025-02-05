//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;

public class ListOddToEven
{
	public static int go( ArrayList<Integer> ray )
	{
        int firstOdd;
        int lastEven;
        for (int i; i < ray.size(); i++)
        {
            if (ray.get(i)%2 != 0)
            {
                firstOdd = ray.get(i);
                break;
            }
        }
        
        for (int i = ray.size()-1; i >= 0; i--)
        {
            if (ray.get(i)%2 == 0)
            {
                lastEven = ray.get(i);
                break;
            }
        }
        int distance = ray.indexOf(firstOdd) - ray.indexOf(lastEven);
        return distance;
		return -1;
