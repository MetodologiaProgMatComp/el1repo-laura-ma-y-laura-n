package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class MyCircle {
    private MyPoint center;
    private int radio;

    MyCircle(int radio){
        center =new MyPoint(0,0);
        this.radio =1;
    }

    public MyCircle(int x, int y,  int radio) {
        this.center= new MyPoint(x,y);
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
        return (int) center.getX();
    }

    public void setCenterX(int x) {
        this.center.setX(x);
    }

    public int getCenterY() {
        return (int) center.getY();
    }

    public void setCenterY(int y) {
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        int[] centerXY= new int[2];
        centerXY[0]= (int) center.getX();
        centerXY[1]= (int) center.getY();
        return centerXY;
    }

    public void setXY(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }


    public String toString() {
        return "my circle[radius= "+radio+"  centro ="+center.toString()+"]";
    }
    public double getArea(){return Math.PI*radio*radio;}
    public double getCircunferencia(){return Math.PI*2*radio;}
    public double getDistance(MyCircle another){return another.getCenter().Distance2(center);}

}
