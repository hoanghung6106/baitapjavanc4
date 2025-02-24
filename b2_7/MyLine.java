package org.example.b2_7;

public class MyLine {
    private MyPoint startPoint;
    private MyPoint endPoint;

    public MyLine() {
        this.startPoint = new MyPoint();
        this.endPoint = new MyPoint();
    }

    public MyLine(MyPoint startPoint, MyPoint endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public MyPoint getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(MyPoint startPoint) {
        this.startPoint = startPoint;
    }

    public MyPoint getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(MyPoint endPoint) {
        this.endPoint = endPoint;
    }

    public double getLength() {
        return startPoint.distance(endPoint);
    }

    public double getDistanceFromStart(int x, int y) {
        return startPoint.distance(x, y);
    }

    public double getDistanceFromEnd(int x, int y) {
        return endPoint.distance(x, y);
    }

    @Override
    public String toString() {
        return "MyLine[start=" + startPoint + ", end=" + endPoint + "]";
    }
}
