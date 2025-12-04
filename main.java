interface mainInterface {
    public void randomEvent();
    public void displayStatus();
}

class riolu implements mainInterface {
    @Override
    public void randomEvent(){
        System.out.println("Riolu is having a random event!");
    }
    @Override
    public void displayStatus(){
        System.out.println("Riolu status displayed.");
    }
}



public class main {
    public static void main(String[] args) {
        riolu myRiolu = new riolu();
        myRiolu.randomEvent();
        myRiolu.displayStatus();
    }

}