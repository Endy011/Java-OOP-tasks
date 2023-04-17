package Task3.seven;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;
    private float xKick;
    private float yKick;
    private float zKick;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp) {
        z += zDisp;
    }

    public boolean near(Ball ball) {
        return Math.sqrt(Math.pow(this.x-ball.getX(),2) + Math.pow(this.y-ball.getY(), 2)) < 8;
    }

    public void kickPower(float x, float y, float z) {
        this.xKick = x;
        this.yKick = y;
        this.zKick = z;
    }
    public void kick(Ball ball) {
        ball.kicked(xKick, yKick, zKick);
    }

    @Override
    public String toString() {
        return "Player's location: (" + x + ", " + y + ", " + z + ")";
    }
}
