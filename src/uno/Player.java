package uno;

import java.util.ArrayList;

public class Player {
    private String name;
    private Hand hand = new Hand();
    private int point;

    public Player(String name) {
        this.name = name;
        this.point = 0;
//        this.hand = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public int getPoint() {
        return point;
    }

    public void drawCard(final Pile drawPile) {
        final var card = drawPile.pop();
        hand.add(card);
    }

    @Override
    public String toString() {
        return name;
    }
}

//karte heben
//karte spielen
//karten zeigen
