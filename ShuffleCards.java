//ShuffleCards.java
import java.util.*;

public class ShuffleCards
{
    private int num;
    private int type;
    private int num0, num1, num2, num3, num4, num5, num6, num7;
    /*
      Types are:
      1 = Spades
      2 = Hearts
      3 = Diamonds
      4 = Clubs
     */
    public ShuffleCards()
    {
	this.num = getNum();
	this.type = getType();
    }
    public int getNum()
    {
	Random nums = new Random();
	int n = nums.nextInt(8);
	return n;
    }
    public int getType()
    {
	Random types = new Random();
	int t = types.nextInt(4);
	return t;
    }
    public ArrayList cardsSet()
    {
	// there are 32 cards.
	// randomly choose 8 sets, and the rest should be for the cop.
	// Collections.shuffle( Arrays.asList(myArray) );
	Random r = new Random();
	ArrayList allCards = new ArrayList();
	// file the array.
	for(int i = 0; i <32; i++)
	    {
		allCards.add(i);
	    }	
	// shuffle the numbers in the array
	Collections.shuffle(allCards);
	return allCards;
    }
}