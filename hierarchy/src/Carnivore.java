public class Carnivore implements Feed{
    protected String name;

    protected Carnivore(String name) {
        this.name = name;
    }

    public void hunt(){
        System.out.println(name + " is hunting");
    }


    @Override
    public void lookForFood() {
        hunt();
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating meat.");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.lookForFood();

        Carnivore pred = new Carnivore("Predator");
        pred.lookForFood();

        Dog d = new Dog();
        d.bark();
        d.eat();

        Herbivore h = new Herbivore("Cow");
        h.eat();
    }
}
