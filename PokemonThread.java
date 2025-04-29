//PokemonThread.java

public class PokemonThread implements Runnable {
    private Pokemon pokemon;
    private Pokemon opponent;

    public PokemonThread(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void setOpponent(Pokemon opponent) {
        this.opponent = opponent;
    }

