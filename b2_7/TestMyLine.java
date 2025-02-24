package org.example.b2_7;
public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyLine line = new MyLine(p1, p2);

        System.out.println(line);
        System.out.println("Length of the line: " + line.getLength());
        System.out.println("Distance from start to (5, 6): " + line.getDistanceFromStart(5, 6));
        System.out.println("Distance from end to (5, 6): " + line.getDistanceFromEnd(5, 6));

        MyLine line2 = new MyLine(new MyPoint(0, 0), new MyPoint(3, 4));
        System.out.println(line2);
        System.out.println("Length of the second line: " + line2.getLength());
    }
}
