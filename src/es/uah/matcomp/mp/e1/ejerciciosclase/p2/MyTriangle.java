package es.uah.matcomp.mp.e1.ejerciciosclase.p2;


public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
//    private int x1;
//    private int y1;
//
//    private int x2;
//    private int y2;
//    private int x3;
//    private int y3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" + "v1= ("+v1.getX()+ ", "+v1.getY() + ") , v2= ("+v2.getX() + ", "+v2.getY()+ "), v3= (" + v3.getX() + ", "+v3.getY() + ")"+'}';
    }

    public double getPerimetro(){
        double lado12=v1.Distance2(v2);
        int lado12red= (int) Math.round(lado12);
        double lado13=v1.Distance2(v3);
        int lado13red= (int) Math.round(lado13);
        double lado23=v2.Distance2(v3);
        int lado23red= (int) Math.round(lado23);
        double per= lado12red +lado13red+ lado23red;
        return per;
    }
    public String getType() {
        double lado12=v1.Distance2(v2);
        int lado12red= (int) Math.round(lado12);
        double lado13=v1.Distance2(v3);
        int lado13red= (int) Math.round(lado13);
        double lado23=v2.Distance2(v3);
        int lado23red= (int) Math.round(lado23);
        if ( lado12red== lado13red && lado12red==lado23red) {
            return "es equilátero";
        }
        if ((lado13red == lado12red)||(lado12red== lado23red)||(lado13red==lado23red)){
            return "es isósceles";
        }
        else{return "es escaleno";}
    }
}
