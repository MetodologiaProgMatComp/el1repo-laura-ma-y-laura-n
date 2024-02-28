package es.uah.matcomp.mp.e1.ejerciciosclase.p3.composicionherencia;

public class LineSub {
    private Point begin; // beginning point
    private Point end; // ending point

    // Constructors
    public LineSub(Point begin, Point end) { // caller to construct the Points
        this.begin = begin;
        this.end =end;
    }
    public LineSub(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() { return (int) begin.getX();}
    public int getBeginY() { return (int) begin.getY(); }
    public int getEndX() { return (int) end.getX(); }
    public int getEndY() {return (int) end.getY(); }

    public void setBeginX(int x) { this.begin.setX(x);}
    public void setBeginY(int y) { this.begin.setY(y); }
    public void setBeginXY(int x,int y) { this.begin.setXY(x,y); }
    public void setEndX(int x) { this.end.setX(x); }
    public void setEndY(int y) { this.end.setY(y); }
    public void setEndXY(int x,int y) {this.end.setXY(x,y); }
    public double getLength()  {  //Distancia desde este punto hasta la instancia dada de MYPoint
        double x2 = begin.getX() - end.getX();
        double y2 = begin.getY() - end.getY();
        double d1 = ((y2 * y2) + (x2 * x2));
        ;
        double distancia = Math.sqrt(d1);
        return distancia;

    }
    public double getGradient() {  return Math.atan2(getBeginY(),getEndX());}

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
