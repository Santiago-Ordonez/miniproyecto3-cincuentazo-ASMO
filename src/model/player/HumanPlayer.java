package model.player;

import model.exceptions.InvalidMoveException;
import model.game.GameModel;
import model.card.Card;

/**
 * Represents the human player in the game.
 * Handles card selection through GUI clicks.
 */
public  class HumanPlayer extends Player{
    public HumanPlayer(String name){
        super(name, true);
    }

    public boolean playSelectedCard(Card card, GameModel gameModel) throws InvalidMoveException {
        if(card == null && !getHand().contains(card)){
            return false;
        }
        return gameModel.playCard(this, card);
    }
}
