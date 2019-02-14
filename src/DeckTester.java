/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args)
    {
        String [] ranks = {"Queen","King","Ace","Two"};
        String [] suits = {"Spade","Diamond","Hearts","Clubs"};
        int [] values = {12,13,14,2};

        Deck one = new Deck(ranks,suits,values);
        one.deal();
        Deck three = new Deck(ranks,suits,values);
        Deck two = new Deck(ranks,suits,values);

        System.out.println(one);
    }
}

