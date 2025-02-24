package org.example.b3_7;
public class Player {
    private String name;
    private float x, y;

    public Player(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() { return name; }

    public float getX() { return x; }
    public void setX(float x) { this.x = x; }

    public float getY() { return y; }
    public void setY(float y) { this.y = y; }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void kick(Ball ball, float xTarget, float yTarget) {
        ball.setX(xTarget);
        ball.setY(yTarget);
        System.out.println(name + " kicked the ball to (" + xTarget + ", " + yTarget + ")");
    }

    public String toString() {
        return "Player " + name + " at (" + x + ", " + y + ")";
    }
}
