public class Card {

    public String number; //ex: ace, 2, king
    public String suit;
    public boolean isEleven; //for aces
    public int value; //ex: 11, 2, 7,

    public Card(int pnumber, int psuit){
        number = "six";
        value = pnumber;
        isEleven = false;

        if(psuit == 2){
            suit = "Hearts";
        }

        if(pnumber == 13){
            number = "King";
            value = 10;
        }

//        printMethod();
    }

    public void printMethod(){
        System.out.println("Your card is a " + number + ". It has a " + suit + " suit. It has a value of " + value + ". It is " + isEleven + " that it is Eleven.");
    }

}

