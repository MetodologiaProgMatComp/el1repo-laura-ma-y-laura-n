package es.uah.matcomp.mp.e1.ejerciciosclase;

public class Ball {
    private float x;
    private float y;
    private int radio;
    private float dx;
    private float dy;

    public Ball(float x, float y, int radio, float dx, float dy) {
        this.x = x;
        this.y = y;
        this.radio = radio;
        this.dx = dx;
        this.dy = dy;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadio() {
        return radio;
    }

    public float getDx() {
        return dx;
    }

    public float getDy() {
        return dy;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void setDx(float dx) {
        this.dx = dx;
    }

    public void setDy(float dy) {
        this.dy = dy;
    }

    public void move(){
        this.x=x+dx;
        this.y=y+dy;
    }

    public void reflectHorizontal(){
        this.dx= - dx;
    }
    public void reflectVertical(){
        this.dy= - dy;
    }

    @Override
    public String toString() {
        return "Ball[("+x+","+y+"), speed("+dx+","+dy+")]";
    }
}
