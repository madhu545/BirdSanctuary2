import java.util.Objects;

public abstract class Bird {

    String id;
    abstract void incrementCount();

    abstract void decrementCount();

    abstract int getCount();

    abstract void eat();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Objects.equals(id, bird.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}