package org.example.b3_7;
public class TestPlayerBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50);
        Player p1 = new Player("Messi", 40, 50);
        Player p2 = new Player("Ronaldo", 60, 50);

        System.out.println(ball);
        System.out.println(p1);
        System.out.println(p2);

        p1.kick(ball, 55, 50);
        System.out.println(ball);

        p2.kick(ball, 70, 50);
        System.out.println(ball);
    }
}
