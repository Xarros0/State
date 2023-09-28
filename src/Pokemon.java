public class Pokemon {
    private PokemonState currentState;

    public Pokemon() {
        // Alustetaan pelihahmo Charmanderiksi
        currentState = new Charmander();
    }

    public void setState(PokemonState newState) {
        currentState = newState;
    }

    public void performAction() {
        currentState.performAction();
    }

    public PokemonState getCurrentState() {
        return currentState;
    }
}
