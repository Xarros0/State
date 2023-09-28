public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();

        for (int i = 0; i < 3; i++) {
            pokemon.performAction();
            System.out.println(); // Lisää tyhjä rivi tilanvaihdon selkeyttämiseksi

            // Hae nykyinen tila
            PokemonState currentState = pokemon.getCurrentState();

            // Tilanvaihdot
            if (currentState instanceof Charmander) {
                pokemon.setState(new Charmeleon());
            } else if (currentState instanceof Charmeleon) {
                pokemon.setState(new Charizard());
            }
        }
    }
}
