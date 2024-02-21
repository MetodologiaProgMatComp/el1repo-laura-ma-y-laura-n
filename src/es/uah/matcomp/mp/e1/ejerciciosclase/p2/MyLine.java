package es.uah.matcomp.mp.e1.ejerciciosclase.p2;
import es.uah.matcomp.mp.e1.ejerciciosclase.p2.MyPoint;

public class MyLine {


    private int x1;
    private int y1;
    private int x2;
    private int y2;
    MyPoint begin =new MyPoint(x1,y1);
    MyPoint end =new MyPoint(x2,y2);



    public MyLine(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin =begin  ;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX(){ return x1;}

    public void setBeginX(int x1) {
        this.x1 = x1;
    }

    public int getBeginY() {return y1;}

    public void setBeginY(int y1) {
        this.y1 = y1;
    }

    public int getEndX() {
        return x2;
    }

    public void setEndX(int x2) {
        this.x2 = x2;
    }

    public int getEndY() {
        return y2;
    }

    public void setEndY(int y2) {
        this.y2 = y2;
    }
    public  int getBeginXY(){return x1+y1;
    }
    public  int getEndXY(){return x2+y2;
    }
    public  void getBeginXY(int x1,int y1){
        this.x1 =x1;
        this.y1 =y1;
    }
    public  void getEndXY(int x2,int y2){
        this.x2 =x2;
        this.y2 =y2;
    }
    public double getLenght(){return getEnd().Distance1(x1,y2);}
    public Double getGradient(){return Math.atan2(getEndXY(),getBeginX());}

    @Override
    public String toString() {
        return "MyLine{begin= ("+x1+","+y1+"), end="+x2+","+y2+"]";
    }
}



