package model;

import java.util.List;

public interface IPlayer {
    String getName();
    List<Card> getHand();
    boolean isHuman();

    void addCard(Card card);
    void removeCard(Card card);
    void clearHand();

    boolean hasValidMove(int currentSum);
    Card chooseCardToPlay(int currentSum);

    int getHandSize();
    boolean isEliminated();
}
