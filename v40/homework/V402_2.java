
package homework;
import java.util.Scanner;
public class V402_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int fizz = input.nextInt();
		int buzz = input.nextInt();
		int n = input.nextInt();
		
		for( int i = 1; i<= n; i++)	{
			if(1 % fizz == 0 && 1 % buzz == 0) {
				System.out.print ("Fizzbuzz");}
			
			else if(i % fizz == 0) {System.out.println("fizz");
			}
			else if(i % buzz == 0) {System.out.println("buzz");}
			else {System.out.println(i);
			}
			}
		}
	}

