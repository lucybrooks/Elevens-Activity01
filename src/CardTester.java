/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
	Card card1 = new Card ("puppies", "star", 7);
	Card card2 = new Card ("kittens", "star", 6);
	Card card3 = new Card ("goldfish", "star", 9);
	
	card1.matches(card2);
	card3.toString();
	
	
	}
}
