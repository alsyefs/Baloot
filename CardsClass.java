//CardsClass.java
public class CardsClass implements CardsInterface
{
    /*
      1 = Spades
      2 = Hearts
      3 = Diamonds
      4 = Clubs
    */
    private int num;
    private int type;
    public CardsClass()
    {
	this.num = 0;
	this.type = 0;
    }
    
    public CardsClass(int num, int type)
    {
	this.num = num;
	this.type = type;
    }
    // method to return actual card number from 7 to Ace.
    public String cardName(int num)
    {
	// 8 numbers between 0 - 7
	String name = "";
	if(num == 0)
	    name = "Seven";
	else if(num == 1)
	    name = "Eight";
	else if(num == 2)
	    name = "Nine";
	else if(num == 3)
	    name = "Ten";
	else if(num == 4)
	    name = "Jack";
	else if(num == 5)
	    name = "Queen";
	else if(num == 6)
	    name = "King";
	else if(num == 7)
	    name = "Ace";
	else
	    name = "ERROR: invalid name!";
	return name;
    }
    // method to return the actual type of card out of four types
    public String cardType(int numType)
    {
	// 4 numbers between 0 - 3
	String type = "";
	if(numType == 0)
	    type = "Spades";
	else if(numType == 1)
	    type = "Hearts";
	else if(numType == 2)
	    type = "Diamonds";
	else if(numType == 3)
	    type = "Clubs";
	else
	    //cardType(this.type);
	    type = "ERROR: invalid type!";
	return type;
    }
    public String findCards(Integer num)
    {
	// I made a mistake when starting with the number 1
	// So here i'm adding 1 to start the values from 1
	// instead of 0.
	num +=1;
	String name = "";
	if(num == 1)
	    name = "Seven Spades";
	else if(num == 2)
	    name = "Eight Spades";
	else if(num == 3)
	    name = "Nine Spades";
	else if(num == 4)
	    name = "Ten Spades";
	else if(num == 5)
	    name = "Jack Spades";	
	else if(num == 6)
	    name = "Queen Spades";
	else if(num == 7)
	    name = "King Spades";
	else if(num == 8)
	    name = "Ace Spades";

	else if(num == 9)
	    name = "Seven Hearts";
	else if(num == 10)
	    name = "Eight Hearts";
	else if(num == 11)
	    name = "Nine Hearts";
	else if(num == 12)
	    name = "Ten Hearts";
	else if(num == 13)
	    name = "Jack Hearts";
	else if(num == 14)
	    name = "Queen Hearts";
	else if(num == 15)
	    name = "Kings Hearts";	
	else if(num == 16)
	    name = "Ace Hearts";

	else if(num == 17)
	    name = "Seven Diamonds";	
	else if(num == 18)
	    name = "Eight Diamonds";
	else if(num == 19)
	    name = "Nine Diamonds";
	else if(num == 20)
	    name = "Ten Diamonds";	
	else if(num == 21)
	    name = "Jack Diamonds";
	else if(num == 22)
	    name = "Queen Diamonds";
	else if(num == 23)
	    name = "King Diamonds";
	else if(num == 24)
	    name = "Ace Diamonds";

	else if(num == 25)
	    name = "Seven Clubs";
	else if(num == 26)
	    name = "Eight Clubs";
	else if(num == 27)
	    name = "Nine Clubs";
	else if(num == 28)
	    name = "Ten Clubs";
	else if(num == 29)
	    name = "Jack Clubs";
	else if(num == 30)
	    name = "Queen Clubs";	
	else if(num == 31)
	    name = "King Clubs";
	else if(num == 32)
	    name = "Ace Clubs";


	return name;
    }
}