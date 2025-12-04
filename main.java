import java.util.Scanner;

interface mainInterface {
    public int randomEvent();
    public void displayStatus();
    public void evolve();
    public void fight();
    public void feedPokemon();
    public void feedCandy();
    public void healPokemon();
    public void faint();
    public void giveBath();
}

class riolu implements mainInterface {
    @Override
    public int randomEvent(){
        int randomNum2 = 0;
        int randomNum = (int)(Math.random() * 3) + 1;
        if ( randomNum == 1){
            randomNum2 = (int)(Math.random() * 2) + 1;
            
        }
        return randomNum2;
    }

    @Override
    public void displayStatus(){
        
    }
}

class shinx implements mainInterface {
    @Override
    public int randomEvent(){
        int randomNum2 = 0;
        int randomNum = (int)(Math.random() * 3) + 1;
        if ( randomNum == 1){
            randomNum2 = (int)(Math.random() * 2) + 1;
            
        }
        return randomNum2;
    }

    @Override
    public void displayStatus(){
        System.out.println("Shinx status displayed.");
    }
}

class litwick implements mainInterface {
    @Override
    public int randomEvent(){
        int randomNum2 = 0;
        int randomNum = (int)(Math.random() * 3) + 1;
        if ( randomNum == 1){
            randomNum2 = (int)(Math.random() * 2) + 1;
            
        }
        return randomNum2;
    }

    @Override
    public void displayStatus(){
        System.out.println("Litwick status displayed.");
    }
}

class cleffa implements mainInterface {
    @Override
    public int randomEvent(){
        int randomNum2 = 0;
        int randomNum = (int)(Math.random() * 3) + 1;
        if ( randomNum == 1){
            randomNum2 = (int)(Math.random() * 2) + 1;
            
        }
        return randomNum2;
    }
    
    @Override
    public void displayStatus(){
        System.out.println("Cleffa status displayed.");
    }
}



public class main {
    public static void main(String[] args) {
        riolu myRiolu = new riolu();
        myRiolu.randomEvent();
        myRiolu.displayStatus();

        shinx myShinx = new shinx();
        myShinx.randomEvent();
        myShinx.displayStatus();

        cleffa myCleffa = new cleffa();
        myCleffa.randomEvent();
        myCleffa.displayStatus();

        litwick myLitwick = new litwick();
        myLitwick.randomEvent();
        myLitwick.displayStatus();
    }

}