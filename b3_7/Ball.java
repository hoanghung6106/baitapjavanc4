package org.example.b3_7;
public class Ball {
    private float x, y;

    public Ball(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() { return x; }
    public void setX(float x) { this.x = x; }

    public float getY() { return y; }
    public void setY(float y) { this.y = y; }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public String toString() {
        return "Ball at (" + x + ", " + y + ")";
    }
}
