public class Parrot extends Bird implements Flyable {

    static int count = 0;

    public Parrot(String id) {
        this.id = id;
    }

    @Override
    void incrementCount() {
        count++;
    }

    @Override
    void decrementCount() {
        count--;
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
