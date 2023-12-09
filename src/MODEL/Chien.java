package MODEL;

public class Chien extends  Animal{

    private String race;

    public Chien(String name, int age, String race) throws Message {
        super(name, age);
        this.race = race;
    }

    public Chien(){
        super();

    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void move() {

    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Chien{" +
                super.toString()+ " "+
                "race='" + race + '\'' +
                '}';
    }

    public void aboie(){
        System.out.println("wouah wouah");
    }

    public void rapport(){
        System.out.println("Os");
    }
}
