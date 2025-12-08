import java.util.Scanner;

interface mainInterface {
    public void randomEvent();
    public void displayStatus();
    public void evolve();
    public void fight();
    public void feedPokemon();
    public void feedCandy();
    public void healPokemon();
    public void giveBath();
}


public class main {
    public static void main(String[] args) {
        int answer = 1;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose from the following options: ");
        System.out.println("Cleffa, Litwick, Riolu, Shinx");
        String userPokemon = input.nextLine();
        
        while (answer == 1) {
            if (userPokemon.equals("Cleffa")) {
                answer = 0;
            }
            else if (userPokemon.equals("Litwick")) {
                answer = 0;
            }
            else if (userPokemon.equals("Riolu")) {
                answer = 0;
            }
            else if (userPokemon.equals("Shinx")) {
                answer = 0;
            }
            else {
                System.out.println("Not a valid option.");
            }
        }
        
        menu();


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

            System.out.print("Your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                
            }else if (choice == 2) {
                
            }else if (choice == 3) {
                
            }else if (choice == 4) {
                
            }else if (choice == 5) {
                
            }else if (choice == 6) {
                
            }else if (choice == 7) {
                
            }else if (choice == 8) {
                
            }else {
                System.out.println("Invalid choice! Try again.");
            }

            System.out.println("");
        }
    }
}