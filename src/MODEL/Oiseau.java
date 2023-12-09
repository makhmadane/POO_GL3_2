package MODEL;

public class Oiseau extends Animal {


    private String espece;

    public Oiseau(String name, int age, String espece) throws Message {
        super(name, age);
        this.espece = espece;
    }

    //Getters / Setters


    public String getEspece() {
        return espece;
    }

    public void setEspece(String espece) {
        this.espece = espece;
    }

    public void vole(){

    }

    public void chante (){

    }

    @Override
    public void makeSound() {

    }

    @Override
    public void move() {

    }

    @Override
    public void display() {

    }

    @Override
    public String toString() {
        return "Oiseau{" +
                 super.toString()+" "+
                "espece='" + espece + '\'' +
                '}';
    }
}
