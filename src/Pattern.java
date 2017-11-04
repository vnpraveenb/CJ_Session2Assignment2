import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
 
		
		System.out.println("Printing a pattern  ");
		
		System.out.print("Please type in the number of alphabets you would like to see starting from 'a'");
		System.out.println("(a = 1 .... z=26): ");
		 
		Scanner scan=new Scanner(System.in);
		
		//Stores the value of the number of alphabets that the user would like to see in the pattern
		int maxChar = scan.nextInt(); 
		
		// Stores the ASCII value of character 'a'
		int asciiNum ='a';  
		
		// For loop to go to a new line until the mid point of the pattern
 		for(int i=1;i<=maxChar;i++)
		{
			
 			
 			/* For loop to move the 1st character in each new line by the 
			 * (value of the maxChar - line number(i))  tabs    
			 */
			for(int j=maxChar-i;j>0;j--)
			{
			 
				System.out.print("\t");
 			}
			
 			 
			/* For loop to print the characters in each line until the character corresponding to
			 * the maxChar is reached(middle)  
			 */
			for(int k = 1;k <i;k++)
			{
				System.out.print((char)(asciiNum+k-1) + "\t");
			}
			
			
			/* For loop to print the characters in each line after the character corresponding to
			 * the maxChar(middle character) in descending order till the 1st character in the line
			 * is printed   
			 */
			for(int l = 1;l <=i;l++)
			{
				System.out.print((char)(asciiNum+i -l) + "\t");
			}
			
			
 			//To go to a new line after characters corresponding to every line are printed
			System.out.println();
 		}
		
 		
 		
		/* For loop to go to a new line after the mid point of the pattern. The number of lines
		 *  is maxChar - 1
		 */
		for(int i=maxChar-1; i>=1; i--)
		{
			
			
			/* For loop to move the 1st character in each new line by the 
			 * (value of the maxChar - line number(i))  tabs    
			 */			
 			for(int j= 1;j<=maxChar-i;j++)
			{
			 
				System.out.print("\t");
 			}
 			 
 			
 			/* For loop to print the characters in each line until the character corresponding to
			 * the maxChar is reached(middle)  
			 */
			for(int k = 1;k<=i;k++)
			{
				System.out.print((char)(asciiNum+k-1) + "\t");
			}
			
			
			/* For loop to print the characters in each line after the character corresponding to
			 * the maxChar(middle character) in descending order till the 1st character in the line
			 * is printed  
			 */
			for(int l = 1;l <i;l++)
			{
				System.out.print((char)(asciiNum+i -l-1) + "\t");
			}
			
			
 			//To go to a new line after characters corresponding to every line are printed
			System.out.println();
 		}
	}

}
