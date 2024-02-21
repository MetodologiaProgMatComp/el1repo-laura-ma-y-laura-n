package es.uah.matcomp.mp.e1.ejerciciosclase.p2;


public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    private int x1;
    private int y1;

    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" + "v1= ("+x1+ ", "+y1 + ") , v2= ("+x2 + ", "+y2+ "), v3= (" + x3 + ", "+y3 + ")"+'}';
    }

    public double getPerimetro(MyPoint v1,MyPoint v2, MyPoint v3){return v1.Distance1(x2,y2)+ v2.Distance1(x3,y3)+ v3.Distance1(x1,y1);}
    public String getType(MyPoint v1,MyPoint v2, MyPoint v3) {
        if ( v1.Distance1(x2,y2)== v2.Distance1(x3,y3) && v3.Distance1(x1,y1)==v1.Distance1(x2,y2)) {
            return "es equilatero";
        }
        if (v3.Distance1(x1, y1) == v2.Distance1(x3, y3)){
            return "es isosceles";
        }
        if(v2.Distance1(x3,y3)==v1.Distance1(x2, y2)){
            return "·s isosceles";
        }
        if(v1.Distance1(x2, y2)== v3.Distance1(x1, y1)){
            return "Es isosceles";
        }
        else{return "es escaleno";}
    }
}
