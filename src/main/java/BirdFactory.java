public class BirdFactory {

    public Bird getBird(String birdName, String name) {
        switch (birdName) {
            case "Parrot":
                return new Parrot(name);
            case "Duck":
                return new Duck(name);
            case "Penguin":
                return new Penguin(name);
            case "Crow":
                return new Crow(name);
            default:
                return null;
        }
    }
}
