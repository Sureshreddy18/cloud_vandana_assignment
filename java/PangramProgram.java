import java.util.Scanner;
public class PangramProgram  
{    
	public static void isPangram(String string)  
	{   
		string = string.toLowerCase();  
		boolean letters= true;   
		for (char ch = 'a'; ch <= 'z'; ch++)   
		{    
			if (!string.contains(String.valueOf(ch)))   
			{  
				letters = false;  
				break;  
			}  
		}    
		if (letters)
		{
			System.out.println("Given String is a Pangram");  
		}
		else 
		{
			System.out.println("Given String not a Pangram"); 
		}
	}    
	public static void main(String args[])  
	{  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String string =sc.nextLine();   
		isPangram(string);  
	}  
}  