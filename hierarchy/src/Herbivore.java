public class Herbivore implements Feed{
    protected String name;

    protected Herbivore(String name) {
        this.name = name;
    }


    @Override
    public void lookForFood() {
        System.out.println(name + " is searching for plants");
    }

    @Override
    public void eat() {
    System.out.println(name + " is eating grass");
    }
}
