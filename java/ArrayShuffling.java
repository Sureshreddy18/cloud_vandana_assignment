import java.util.Arrays;
import java.util.Random;
public class ArrayShuffling
{
	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		shuffleArray(array);
		System.out.println("Shuffled Array is : " + Arrays.toString(array));
	}
	public static void shuffleArray(int[] array)
	{
		int n = array.length;
		Random random = new Random();
		for (int i = n - 1; i > 0; i--)
		{
			int j = random.nextInt(i + 1);
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
}