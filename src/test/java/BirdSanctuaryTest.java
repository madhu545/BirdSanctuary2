import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BirdSanctuaryTest {

    @Test
    public void AddBirdTest() {
        BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
        Crow crow = new Crow("c1");
        birdSanctuaryManager.add(crow);
        int count = crow.getCount();
        Assertions.assertEquals(1, count);
    }

    @Test
    public void givenValueNull_ShouldThrowCustomException() {
        BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
        birdSanctuaryManager.add(null);
        int count = birdSanctuaryManager.getAllCount();
        Assertions.assertEquals(0, count);
    }
    @Test
    public void removedValue_ShouldThrowCustomException() {
        BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
        Crow crow = new Crow("c1");
        Assertions.assertThrows(BirdSanctuaryAddException.class,() -> {birdSanctuaryManager.remove(crow);});
    }
}