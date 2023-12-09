import MODEL.Animal;
import MODEL.Chien;
import MODEL.Message;

public class Main {
    public static void main(String[] args) throws Message {

        Chien chien = new Chien("Alex",-2,"Pitbull");
        chien.display();

        Animal animal = new Chien();
        ((Chien)animal).setRace("");
    }
}