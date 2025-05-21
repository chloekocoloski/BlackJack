public class BasicGameApp {
  public static void main(String[] args) {
    BasicGameApp go = new BasicGameApp();
  }
  public Player player;
  public Dealer dealer;
  public Card[] deck;


  public BasicGameApp() {
    System.out.println("Let's play Blackjack!");

    deck = new Card [52];

    for(int all = 0; all < 4; all++) {

      for (int x = 0; x < 13; x++) {
        //object called: "FirstCard"
        Card FirstCard = new Card(x + 1, all);
        FirstCard.printMethod();

        //put "FirstCard" into deck at index 0
        deck[x] = FirstCard;
      }

    }


  }
}
