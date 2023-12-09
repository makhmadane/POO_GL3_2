package MODEL;

public abstract class Animal {

    protected String name;
    protected int age;


    //Constructeur

    public Animal(String name, int age) throws Message {
        this.name = name;
        this.setAge(age);
    }

    public Animal(){

    }




    //Getters / Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Message {
       /* if(age<0){
            System.out.println("Age doit etre sup a 0 ");
        }else {
            this.age = age;
        }*/

        try {
           this.age =  this.age/1;

        }catch (ArithmeticException e ){
            throw  new Message("un nombre n est jamais div par 0");
        }finally {
            System.out.println("ISI");
        }

    }

    //Method abstract
    public abstract void makeSound();
    public abstract void move();
    public abstract void display();


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age ;

    }
}
