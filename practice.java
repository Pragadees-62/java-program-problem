class Point {
    protected int x, y;

    public Point(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
}

public class practice {
    public static void main(String args[])
    {
        Point p = new Point(5,7);
        System.out.println("x = " + p.x + ", y = " + p.y);
    }
}