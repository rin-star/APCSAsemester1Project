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
            pokemon.feed();
        }
        else if (userNum == 2) {
            pokemon.play();
        }
        else if (userNum == 3) {
            pokemon.returnStats();
        }
    }
    //menu
    public static void menu() {
        System.out.println("Please make a selection from the options below.");
        System.out.println("1. Feed");
        System.out.println("2. Play");
        System.out.println("3. Show stats");
    }

    
}