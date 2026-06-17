package model;

public class HumanPlayer extends Player{
    public HumanPlayer(String name){
        super(name, true);
    }

    @Override
    public Card chooseCardToPlay(int currentSum){
        //I don't know how to do
        return null;
    }

    public void playCard(Card card){
        if(card != null && getHand().contains(card)){
            removeCard(card);
        }
    }
}
