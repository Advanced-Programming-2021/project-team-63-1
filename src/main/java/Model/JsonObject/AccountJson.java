package Model.JsonObject;

import java.util.ArrayList;
import Model.Deck;

public class AccountJson {
    private String username;//Identity
    private String password;
    private String nickname;
    private int score;
    private int money;
    private ArrayList<CardJson> purchasedCards;
    private ArrayList<DeckJson> decks;
    private DeckJson activeDeck;

    public AccountJson(String username, String password, String nickname){
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.score = 0;
        this.money = 0;
        purchasedCards = new ArrayList<>();
        decks = new ArrayList<>();
        activeDeck = null;
    }

    public String getUsername() {
        return this.username;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public String getNickname(){
        return this.nickname;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }

    public int getScore(){
        return this.score;
    }

    public ArrayList<DeckJson> getDecks(){
        return this.decks;
    }

    public void addDeck(String deckName){
        this.decks.add(new DeckJson(deckName));
    }

    public void deleteDeck(DeckJson deck){
        this.decks.remove(deck);
    }

    public void setActiveDeck(DeckJson deck){
        this.activeDeck = deck;
    }
    public DeckJson getActiveDeck(){
        return this.activeDeck;
    }

    public DeckJson getDeckByName(String deckName){
        for (DeckJson deck : getDecks()) {
            if(deck.getName().equals(deckName))
                return deck;
        }
        return null;
    }

    public boolean doesHaveThisCard(String cardName) {
        for (CardJson purchasedCard : purchasedCards) {
            if(purchasedCard.getName().equals(cardName))
                return true;
        }
        return false;
    }
}
