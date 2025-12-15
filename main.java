import java.util.Scanner;
/**
 * The main class for the Pokemon game.
 * This class allows the user to create a Pokemon, interact with it, and play the game.
 */
public class main {

    public String pokemonName;
    /**
     * The main method serves as the entry point for the program.
     * It initializes the game, allows the user to create a Pokemon, and provides a menu for interaction.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        boolean continuePlaying = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Which pokemon do you want? (shinx, cleffa, litwick, riolu): ");
        String userInput = input.nextLine();
        
        Pokemon currentPokemon = createPokemon(userInput);
        System.out.println("You created a pokemon!");
        
        while (currentPokemon.getHealth() >= 0 && continuePlaying) {
            menu();
            int userNum = input.nextInt();
            if (userNum == 0) {
                continuePlaying = false;
            }
            selection(userNum, currentPokemon);
        }
        if (currentPokemon.getHealth() <= 0){
            System.out.println("Your pokemon has fainted. Game over.");
        }
        else {
            System.out.println("You abandoned your pokemon.");
            System.out.println("Thanks for playing!");
        }
    }
    
    /**
     * Creates a Pokemon object based on the user's input.
     *
     * @param userInput The name of the Pokemon the user wants to create.
     * @return A Pokemon object corresponding to the user's input, or null if the input is invalid.
     */
    public static Pokemon createPokemon(String userInput){
        Pokemon pokemon = null;
        if (userInput.equalsIgnoreCase("Cleffa")){
            pokemon = new cleffa();
        }
        
        else if (userInput.equalsIgnoreCase("Shinx")){
            pokemon = new shinx();
        }
        
        else if (userInput.equalsIgnoreCase("Riolu")){
            pokemon = new riolu();
        }
        
        else if (userInput.equalsIgnoreCase("Litwick")){
            pokemon = new litwick();
        }
        
        else {
            System.out.println("That's not a valid input.");
        }
        return pokemon;
    }
    /**
     * Creates a Pokemon object based on the user's input.
     *
     * @param userInput The name of the Pokemon the user wants to create.
     * @return A Pokemon object corresponding to the user's input, or null if the input is invalid.
     */
    public static void selection(int userNum, Pokemon pokemon) {
        if (userNum == 1) {
            pokemon.returnStats();
        }
        else if (userNum == 2) {
            pokemon.feed();
        }
        else if (userNum == 3) {
            pokemon.play();
        }
        else if (userNum == 4) {
            pokemon.giveBath();
        }
        else if (userNum == 5) {
            pokemon.heal();
        }
        else if (userNum == 6) {
            pokemon.evolve();
        }
        else if (userNum == 7) {
            pokemon.fightTrainer();
        }
        else if (userNum == 8) {
            Scanner input = new Scanner(System.in);
            System.out.print("What candy do you want to feed your pokemon?(big, small): ");
            String candyInput = input.nextLine();
            pokemon.feedCandy(candyInput);
        }
        else if (userNum == 9) {
            pokemon.rest();
        }
        else if (userNum == 0) {
            System.out.println("Thanks for playing!");
            System.exit(0);
        }
        else {
            System.out.println("That's not a valid input.");
        }
    }
    /**
     * Displays the menu of options for the user to interact with their Pokemon.
     * The user can choose from various actions such as showing stats, feeding, playing, and more.
     */
    public static void menu() {
        System.out.println("Please make a selection from the options below. (choose a number");
        System.out.println("1. Show stats");
        System.out.println("2. Feed");
        System.out.println("3. Play");
        System.out.println("4. Give Bath");
        System.out.println("5. Heal");
        System.out.println("6. Evolve");
        System.out.println("7. Fight Trainer");
        System.out.println("8. Feed Candy");
        System.out.println("9. Rest");
        System.out.println("0. Exit");
    }

    
}