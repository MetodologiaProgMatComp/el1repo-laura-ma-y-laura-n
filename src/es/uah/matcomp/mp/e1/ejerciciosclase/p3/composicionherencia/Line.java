package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia;

public class Line extends Point{
    private Point end;

    public Line(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point(endX, endY); // construct the end Point
    }
    public Line(Point begin, Point end) { // caller to construct the Points
        super(begin.getX(), begin.getY()); // need to reconstruct the begin Point
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + super.toString() +
                ", end=" + end.toString() +
                '}';
    }

    public Point getBegin() {
        return new Point (super.getX(), super.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point nuevo) {
        super.setX(nuevo.getX());
        super.setY(nuevo.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX(){return super.getX();}
    public int getBeginY(){return super.getY();}
    public int getEndX(){return end.getX();}
    public int getEndY(){return end.getY();}

    public void setBeginX(int x) { super.setX(x);}
    public void setBeginY(int y) { super.setY(y); }
    public void setBeginXY(int x,int y) { super.setXY(x,y); }
    public void setEndX(int x) { this.end.setX(x); }
    public void setEndY(int y) { this.end.setY(y); }
    public void setEndXY(int x,int y) {this.end.setXY(x,y); }
    public double getLength()  {  //Distancia desde este punto hasta la instancia dada de MYPoint
        double x2 = super.getX() - end.getX();
        double y2 = super.getY() - end.getY();
        double d1 = ((y2 * y2) + (x2 * x2));
        ;
        double distancia = Math.sqrt(d1);
        return distancia;

    }
    public double getGradient() {  return Math.atan2(getBeginY(),getEndX());}

    //¿Qué considero mejor: Herencia o composición?
    //Considero mejor la composción pues peudes modificar en tiempo de ejecución.

}
