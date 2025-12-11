import java.util.Scanner;

interface mainInterface {
    public void randomEvent();
    public void displayStatus();
    public void evolve();
    public void feedCandy();
    public void feed();
    public void giveBath();
    public void heal();
    public void play();
    public void fightTrainer();

    public int getHealth();
    public void setHealth(int health);

    public int getHappiness();
    public void setHappiness(int happiness);

    public int getEnergy();
    public void setEnergy(int energy);

    public int getEvolutionLevel();
    public void setEvolutionLevel(int evolutionLevel);

    public String getType();
    public void setType(String type);

    public int getHunger();
    public void setHunger(int hunger);

    public void userPick();
}

/**
 * The main class for the Pokemon game.
 * This class handles the game loop, user input, and interaction with the Pokemon.
 *
 * @author Rin Ryu
 * @author Jacob Le
 * @author Ashlynn K
 * @author Natalee Ngo
 */
public class main {

    /**
     * The main method serves as the entry point for the program.
     * It initializes the game, handles user input, and manages the game loop.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        boolean continuePlaying = true;

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose from the following options: ");
        System.out.println("Cleffa, Litwick, Riolu, Shinx");

        // Read the user's chosen Pokemon
        String userPokemon = input.nextLine();

        // Create a Pokemon object based on the user's choice
        main pokemon = createPokemon(userPokemon);

        // Game loop
        while (continuePlaying) {
            // Check if the Pokemon has fainted
            if (pokemon.getHealth() > 0) {
                System.out.print("Your pokemon has fainted!");
                break;
            }

            // Display the menu options
            menu();

            // Handle the user's menu selection
            userPick((mainInterface) pokemon);

            // Print a blank line for formatting
            System.out.println("");
        }
    }

    /**
     * Handles user input for Pokemon actions.
     * @param pokemon the Pokemon to perform actions on
     */
    public static void userPick(mainInterface pokemon) {
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        if (choice == 1) {
            pokemon.displayStatus();
        }else if (choice == 2) {
            pokemon.evolve();
        }else if (choice == 3) {
            pokemon.fightTrainer();
        }else if (choice == 4) {
            pokemon.feed();
        }else if (choice == 5) {
            pokemon.feedCandy();
        }else if (choice == 6) {
            pokemon.heal();
        }else if (choice == 7) {
            pokemon.giveBath();
        }else if (choice == 8) {
            System.out.print("ok....");
        }else {
            System.out.println("Invalid choice! Try again.");
        }
    }

    /**
     * Displays the game menu options to the user.
     */
    public static void menu() {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.println("Choose an action:");
        System.out.println("1. Display Status");
        System.out.println("2. Evolve");
        System.out.println("3. Fight");
        System.out.println("4. Feed Pokemon");
        System.out.println("5. Feed Candy");
        System.out.println("6. Heal Pokemon");
        System.out.println("7. Give Bath");
        System.out.println("8. Exit");
    }

    /**
     * Factory method to create Pokemon instances by name.
     * @param pokemonType name of Pokemon to create
     * @return Pokemon instance or null if invalid
     */
    public static main createPokemon(String pokemonType){
        main pokemon;
        if (pokemonType.equalsIgnoreCase("Shinx")){
            pokemon = new shinx();
            return pokemon;
        }
        else if (pokemonType.equalsIgnoreCase("Litwick")){
            pokemon = new litwick();
            return pokemon;
        }
        else if (pokemonType.equalsIgnoreCase("Cleffa")){
            pokemon = new cleffa();
            return pokemon;
        }
        else if (pokemonType.equalsIgnoreCase("Riolu")){
            pokemon = new riolu();
            return pokemon;
        }
        else {
            return null;
        }
    }

    private int getHealth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
