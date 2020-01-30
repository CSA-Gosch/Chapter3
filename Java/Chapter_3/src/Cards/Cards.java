package Cards;

public class Cards {
    public static void main(String[] args) {
        int x = 0;
        while(x < 2) {
            int card;
            int suit;
            GetCards getCard = new GetCards();
            GetCards getSuit = new GetCards();
            char[] suits = {'S', 'H', 'D', 'C'};
            final int CARDS_IN_SUIT = 13;

            card = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
            getCard.setCardBruh(card);
            suit = ((char) (Math.random() * 100) % 4);
            getSuit.setSuitBruh(suits[suit]);
            System.out.println("Your Card " + getCard.getCardBruh() + " of " + getSuit.getSuitBruh());
            x++;
        }
    }
}
