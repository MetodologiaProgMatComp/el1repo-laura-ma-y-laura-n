package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(){}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x,int y){
        this.y=y;
        this.x=x;
    }
    public int[] getXY(){
        int[] result = new int[2];
        result[0]=x;
        result[1]=y;
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}//