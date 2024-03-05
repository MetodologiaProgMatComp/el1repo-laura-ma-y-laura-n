package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Movable;

public class MovableCircle implements InterfazMovable {
    private int radius;
    MovablePoint center;

    public MovableCircle(int radius,int x, int y, int xSpeed,int ySpeed  ) {
        this.radius = radius;
         this.center= new MovablePoint(x,y,xSpeed,ySpeed);

    }



    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center= (" + center.x +","+center.y+ ") , speed=("+center.xSpeed+","+center.ySpeed+")"+
                '}';
    }

    public void moveUp(){ center.y+= center.ySpeed;}




    public void moveDown(){ center.y-= center.ySpeed;}
    public void moveRight(){ center.x+= center.xSpeed;}
    public void moveLeft(){ center.x-= center.xSpeed;}
}
