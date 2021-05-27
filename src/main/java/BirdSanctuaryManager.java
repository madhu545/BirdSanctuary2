import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryManager {

    //List<Bird> birdList = new ArrayList<Bird>();
    Set<Bird> birdList = new HashSet<Bird>();

    static BirdSanctuaryManager instance;

    static BirdSanctuaryManager getInstance() {
        if (instance == null) {
            instance = new BirdSanctuaryManager();
        }
        return instance;
    }

    private BirdSanctuaryManager() {

    }

    public void add(Bird bird) {
        try {
            if (bird == null) {
                throw new BirdSanctuaryAddException("Bird does not exist");
            }
            if (birdList.add(bird)) {
                bird.incrementCount();
            }
        } catch(BirdSanctuaryAddException e) {
            e.printStackTrace();
        }
    }

    public void remove(Bird bird) throws BirdSanctuaryAddException {
        if(birdList.contains(bird)) {
            birdList.remove(bird);
            bird.decrementCount();
        } else {
            throw new BirdSanctuaryAddException("Bird did not exist");
        }

    }

    public int getAllCount() {
        return birdList.size();
    }

    public void printSwimmable() {
        birdList.stream().filter(bird -> bird instanceof Swimmable)
                .forEach(bird -> ((Swimmable)bird).swim());
    }

    public void printFlyable() {
        birdList.stream().filter(bird -> bird instanceof Flyable)
                .forEach(bird -> ((Flyable)bird).fly());
    }

    public void printEatable() {
        birdList.stream().forEach(Bird::eat);
    }
}
