package org.example.b2_10;
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public MyRectangle(double x1, double y1, double x2, double y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }
    public double getLength() {
        return Math.abs(topLeft.getX() - bottomRight.getX());
    }
    public double getWidth() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }
    public double getArea() {
        return getLength() * getWidth();
    }
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
