package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class MyCircle {

    private int x;
    private int y;
    private MyPoint center;
    private int radio;

    MyCircle(int radio){
        center =new MyPoint(0,0);
        this.radio =1;
    }

    public MyCircle(int x, int y,  int radio) {
        this.x = x;
        this.y = y;
        this.radio = radio;
    }

    public MyCircle(MyPoint center, int radio) {
        this.center = center;
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return x;
    }

    public void setCenterX(int x) {
        this.x = x;
    }

    public int getCenterY() {
        return y;
    }

    public void setCenterY(int y) {
        this.y = y;
    }
    public int[] getCenterXY() {
        return new int[]{x, y};
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public String toString() {
        return "my circle[radius= "+radio+"  centro ="+center.toString()+"]";
    }
    public double getArea(){return Math.PI*radio*radio;}
    public double getCircunferencia(){return Math.PI*2*radio;}
    public double getDistance(MyPoint antoher){return antoher.Distance3();}

}
