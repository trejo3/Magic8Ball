import java.util.Random;
import java.util.Scanner;

public class Magic8Ball
{
	public static void main ( String[] args )
	{
		Magic myMagic = new Magic();
		Scanner input = new Scanner(System.in);
		
		System.out.println("MAGIC 8 BALL");
		System.out.println("");
		System.out.println("        _.a$$$$$a._   ");
		System.out.println("     ,$$$$$$$$$$$$$$$.");
		System.out.println("   ,$$$$$$$$$$$$$$$$$$$.");
		System.out.println("  d$$$$$$$$$$$$$$$$$$$$$b");
		System.out.println(" d$$$$$$$$$~'''`~$$$$$$$$b");
		System.out.println("($$$$$$$$p   _   q$$$$$$$$)");
		System.out.println("$$$$$$$$$   (_)   $$$$$$$$$");
		System.out.println("$$$$$$$$$   (_)   $$$$$$$$$");
		System.out.println("($$$$$$$$b       d$$$$$$$$)");
		System.out.println(" q$$$$$$$$$a._.a$$$$$$$$$p");
		System.out.println("  q$$$$$$$$$$$$$$$$$$$$$p");
		System.out.println("   `$$$$$$$$$$$$$$$$$$$'");
		System.out.println("     `$$$$$$$$$$$$$$$'");
		System.out.println("        `~$$$$$$$$~'");
		System.out.println("");
		
		String cont;
		do{
		
			System.out.println("Ask me a question and I will predict the future: ");
			String question = input.next();
			
			System.out.println("");
			
			System.out.println( "MAGIC 8-BALL SAYS: " + myMagic.ShakeIt() );
			
			System.out.println("");
			
			System.out.println("Would you like to ask another question?..");
			cont = input.next();
			
		
		} while(cont.equals("yes"));
		
		input.close();
	}
}
