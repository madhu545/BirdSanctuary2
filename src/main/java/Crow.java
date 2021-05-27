public class Crow extends Bird implements Flyable {
    static int count = 0;

    public Crow(String id) {
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
        System.out.println("Crow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Crow is flying");
    }
}
