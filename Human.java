package HumanVSMonter;

import java.util.Random;

public class Human {
    private int x;
    private int y;

    public Human(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move() {
        Random rand = new Random();
        int i = rand.nextInt(4);

        switch (i) {
            case 0:
                if (y>1) {
                    y--;
                }
                break;
            case 3:
                if (x>1) {
                    x--;
                }
                break;
            case 1:
                if (x<Land.MAX_X-1) {
                    x++;
                }
                break;
            case 2:
                if (y<Land.MAX_Y-1) {
                    y++;
                }
                break;
        }
    }
}
