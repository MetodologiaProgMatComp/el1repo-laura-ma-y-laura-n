package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class MyPoint {

    private double x = 0;
    private double y = 0;

    public MyPoint() {
        x=0;
        y=0;
    }

    public MyPoint(double v, double v1) {
        this.x = v;
        this.y = v1;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY() {
        return new double[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double Distance1(int x2, int y2) { //Distancia desde este punto hasta el dado (x,y)
        double x3 = x - x2;
        double y3 = y - y2;
        double d1 = ((y3 * y3) + (x3 * x3));
        ;
        double distancia = Math.sqrt(d1);
        return distancia;

    }

    public double Distance2(MyPoint another) {  //Distancia desde este punto hasta la instancia dada de MYPoint
        double x2 = another.getX() - x;
        double y2 = another.getY() - y;
        double d1 = ((y2 * y2) + (x2 * x2));
        ;
        double distancia = Math.sqrt(d1);
        return distancia;

    }

    public double Distance3() {  //distancia desde el origen
        double d1 = (this.x * this.x) + (this.y * this.y);
        double distancia = Math.sqrt(d1);
        return distancia;

    }

}

