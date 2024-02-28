package es.uah.matcomp.mp.e1.ejerciciosclase.p3;

public class Point {

    private float x=0.0f;
    private float y=0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point(){}

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.y=y;
        this.x=x;
    }
    public float[] getXY(){
        float[] result = new float[2];
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
