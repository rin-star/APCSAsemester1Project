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
    public void setHealth();
    public int getHappiness();
    public void setHappiness();
    public int getEnergy();
    public void setEnergy();
    public int getEvolutionLevel();
    public void setEvolutionLevel();
    public String getType();
    public void setType();
    public int getHunger();
    public void setHunger();
}


public class main {
    public static void main(String[] args) {
        int answer = 1;
        boolean continuePlaying = true;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose from the following options: ");
        System.out.println("Cleffa, Litwick, Riolu, Shinx");
        String userPokemon = input.nextLine();
        mainInterface pokemon = null;
        
        while (answer == 1) {
            if (userPokemon.equals("Cleffa")) {
                answer = 0;
                pokemon = new cleffa();
            
            }
            else if (userPokemon.equals("Litwick")) {
                answer = 0;
                pokemon = new litwick();
            }
            else if (userPokemon.equals("Riolu")) {
                answer = 0;
                pokemon = new riolu();
            }
            else if (userPokemon.equals("Shinx")) {
                answer = 0;
                pokemon = new shinx();
            }
            else {
                System.out.println("Not a valid option.");
            }
        }

        while (continuePlaying) {
            if (pokemon.getHealth() > 0) {
                System.out.print("Your pokemon has fainted!");
                break;
            }
            menu();
        }
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
                continuePlaying = false;
            }else {
                System.out.println("Invalid choice! Try again.");
            }

            System.out.println("");
        
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 8) {
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
    }
    }