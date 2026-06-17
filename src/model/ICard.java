package model;

public interface ICard {
    int getRank();
    int getSuit();
    String getRankString();
    String getSuitString();
    int getValue();
    boolean isValidMove(int currentSum);
}