package model;

import java.util.List;

public interface IDeck {
    void shuffle();
    Card drawCard();
    void dealToPlayer(IPlayer player);
    void addCards(List<Card> cards);
    void recycleTableCards(List<Card> tablePile);
    int size();
    boolean isEmpty();
    void reset();
}
