package HumanVSMonter;

public class Land {
    public static int MAX_X = 5;
    public static int MAX_Y = 5;

    public static void main(String[] args) throws Exception {
        Human human = new Human(1,1);
        Monster monster = new Monster(4,4);

        while (monster.getX() != human.getX() || monster.getY() != human.getY()) {
            Thread.sleep(1000);
            printLand(monster,human);
            monster.move();
            human.move();
        }
        printLand(monster,human);
    }


    public static void printLand(Monster monster, Human human) {
        for (int i = 0; i < MAX_Y; i++) {
            for (int j = 0; j < MAX_Y; j++) {
                if (i == monster.getX() && j == monster.getY()) {
                    System.out.print("o ");
                }
                else if (i == human.getX() && j == human.getY()) {
                    System.out.print("x ");
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}
