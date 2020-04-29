/*
Written By Saleh Abdullah S. Alsyefi
A java program to play the famous cards game of "Baloot"
*/
import java.util.*;
// to show the boxes.
import javax.swing.*;
import java.awt.*;

public class BalootMain
{
    public static void main(String [] args)
    {
	ShuffleCards shuffle = new ShuffleCards();
	// get the random number of card and type.
	int randomNum = shuffle.getNum(), randomType = shuffle.getType();
	CardsClass cards = new CardsClass(randomNum, randomType);
	// get the actual value of card number and type.
	String num = cards.cardName(randomNum), type = cards.cardType(randomType);
	//System.out.println(num+" "+type);
	
	// Get the shuffled cards.
	ArrayList myCards = new ArrayList();
	myCards = chooseCards();
	// store each player's cards in a separate array.
	ArrayList p1 = new ArrayList();
	ArrayList p2 = new ArrayList();
	ArrayList p3 = new ArrayList();
	ArrayList p4 = new ArrayList();	
	//System.out.println(myCards);

	// Give each player 8 cards
	int index = 0;
	p1 = giveCards(index, myCards); p2=giveCards(index + 8, myCards); 
	p3=giveCards(index + 16, myCards); p4=giveCards(index + 24, myCards);
	System.out.println("\n\n"+p1 + "\n\n" + p2 + "\n\n" + p3 + "\n\n" + p4+"\n\n");
	welcomeBox(p1, p2, p3, p4);
	//To show the cards
	//showCards(p1);
    }
    /*public static void showCards(ArrayList p1)
    {
    // To match every card with its image!
    // For now it only shows the names of the cards for player_1, not the images!
    checkCards(p1);
    }*/

    /*
      // This method should be edited in the future
      public static void checkCards(ArrayList p1)
      {
      
      }
     */
    public static void welcomeBox(ArrayList p1, ArrayList p2, ArrayList p3, ArrayList p4)
    {
		String message = "\n\nPlayer 1: " + p1+"\n\nPlayer 2: " + p2+"\n\nPlayer 3: " + p3+"\n\nPlayer 4: " + p4;
	JOptionPane.showMessageDialog(null, "Hello!"+message);
    }

    // this method gives 8 cards for each play
    public static ArrayList giveCards(int index, ArrayList myCards)
    {
	// store 8 cards with their 8 types.
	ArrayList list = new ArrayList<String>();
	int size = index + 8;
	for(int i = index; i < size; i++)
	    {
		list.add(myCards.get(i));
	    }
	// this player now gets 8 shuffled cards.
	return list;	
    }
    
    public static ArrayList chooseCards()
    {
	// each player gets 8 random cards
	// there are 4 players, which means that all cards must be 32 cards
	ArrayList allCards = new ArrayList();
	ShuffleCards shuffle = new ShuffleCards();
	// Now we get a filled array with shuffled numbers.
	allCards = shuffle.cardsSet();
	// Convert the numbers to Strings.
	CardsClass cards = new CardsClass();
	Integer index = 0;
	String theObject = "";
	for(int i = 0; i < 32; i++)
	    {	
		index = (Integer) allCards.get(i);
		theObject = cards.findCards(index);
		// replace the number values to Strings.
		allCards.set(i, theObject);
	    }
	return allCards;
    }
}