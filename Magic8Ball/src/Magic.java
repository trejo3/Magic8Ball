import java.util.Random;

public class Magic 
{
	String response1 = "It is certain";
	String response2 = "It is decidedly so";
	String response3 = "Without a doubt";
	String response4 = "Yes - definitely";
	String response5 = "You may rely on it";
	String response6 = "As I see it, yes";
	String response7 = "Most likely";
	String response8 = "Outlook good";
	String response9 = "Signs point to yes";
	String response10 = "Yes";
	String response11 = "Reply hazy, try again";
	String response12 = "Ask again later";
	String response13 = "Better not tell you now";
	String response14 = "Cannot predict now";
	String response15 = "Concentrate and ask again";
	String response16 = "Don't count on it";
	String response17 = "My reply is no";
	String response18 = "My sources say no";
	String response19 = "Outlook not so good";
	String response20 = "Very doubtful";

	public String ShakeIt()
	{
		Random r = new Random();

		int choice = 1 + r.nextInt(20);
		
		String response;
		
		if ( choice == 1 )
			response = response1;
		else if ( choice == 2 )
			response = response2;
		else if ( choice == 3 )
			response = response3;
		else if ( choice == 4 )
			response = response4;
		else if ( choice == 5 )
			response = response5;
		else if ( choice == 6 )
			response = response6;
		else if ( choice == 7 )
			response = response7;
		else if ( choice == 8 )
			response = response8;
		else if ( choice == 9 )
			response = response9;
		else if ( choice == 10 )
			response = response10;
		else if ( choice == 11 )
			response = response11;
		else if ( choice == 12 )
			response = response12;
		else if ( choice == 13 )
			response = response13;
		else if ( choice == 14 )
			response = response14;
		else if ( choice == 15 )
			response = response15;
		else if ( choice == 16 )
			response = response16;
		else if ( choice == 17 )
			response = response17;
		else if ( choice == 18 )
			response = response18;
		else if ( choice == 19 )
			response = response19;
		else if ( choice == 20 )
			response = response20;
		else 
			response = "8-BALL ERROR!";
		
		return response;
	}
}
