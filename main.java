import java.util.Scanner;
public class main {

    public String pokemonName;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which pokemon do you want?: ");
        String userInput = input.nextLine();
        
        Pokemon currentPokemon = createPokemon(userInput);
        System.out.println("You created a pokemon!");
        
        while (currentPokemon.getHealth() >= 0) {
            menu();
            int userNum = input.nextInt();
            selection(userNum, currentPokemon);
        }
        
    }
    
    //create pokemon
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
        else {
            System.out.println("That's not a valid input.");
        }
    }
    //menu
    public static void menu() {
        System.out.println("Please make a selection from the options below.");
        System.out.println("1. Show stats");
        System.out.println("2. Feed");
        System.out.println("3. Play");
        System.out.println("4. Give Bath");
        System.out.println("5. Heal");
        System.out.println("6. Evolve");
        System.out.println("7. Fight Trainer");
        System.out.println("8. Feed Candy");
        System.out.println("9. Rest");
    }

    
}