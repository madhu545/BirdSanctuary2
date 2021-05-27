public class Penguin extends Bird implements Swimmable {

    static int count = 0;

    public Penguin(String id) {
        this.id = id;
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }


    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
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
}
