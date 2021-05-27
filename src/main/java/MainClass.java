public class MainClass {

    public static void main(String[] args){
        System.out.println("Welcome to Bird Sanctuary");

        BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
        BirdFactory birdFactory = new BirdFactory();

        Bird parrot = birdFactory.getBird("Parrot","p");
        Bird parrot1 = birdFactory.getBird("Parrot","p1");
        Bird parrot2 = birdFactory.getBird("Parrot","p2");
        Bird parrot3 = birdFactory.getBird("Parrot","p3");
        Bird duck = birdFactory.getBird("Parrot","p3");
        Bird penguin = birdFactory.getBird("Penguin", "pn");
        Bird crow = birdFactory.getBird("Crow", "c");

        birdSanctuaryManager.add(null);
        birdSanctuaryManager.add(parrot1);
        birdSanctuaryManager.add(parrot2);
        birdSanctuaryManager.add(parrot3);
        birdSanctuaryManager.add(penguin);
        birdSanctuaryManager.add(duck);
        birdSanctuaryManager.add(duck);
        birdSanctuaryManager.add(duck);
        birdSanctuaryManager.add(crow);

        birdSanctuaryManager.printFlyable();
        birdSanctuaryManager.printSwimmable();
        birdSanctuaryManager.printEatable();
        //birdSanctuaryManager.remove(parrot1);

        System.out.println("Total birds : " + birdSanctuaryManager.getAllCount());

        System.out.println("Number of Parrots are : " + parrot.getCount());
        System.out.println("Number of Penguins are : " + penguin.getCount());
        System.out.println("Number of Ducks are : " + duck.getCount());
        System.out.println("Number of Crows are : " + crow.getCount());

    }
}
