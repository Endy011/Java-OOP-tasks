package Task3.seven;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(1, 4, 5);
        Ball ball = new Ball(2, 4, 0);

        System.out.println(player1.toString());
        System.out.println(player1.near(ball));
        System.out.println(ball.toString());
        player1.move(-2, -1);
        System.out.println(player1.toString());
        player1.kickPower(3, 4, 2);
        player1.kick(ball);
        System.out.println(ball.toString());
        player1.jump(99);
        System.out.println(player1.toString());

    }
}
