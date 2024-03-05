package es.uah.matcomp.mp.e1.ejerciciosclase.p4.Movable;

public class MovablePoint implements InterfazMovable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "(" + x +","+ y +
                "), Speed=" + xSpeed +","+
                ySpeed + ")"+
                '}';
    }

    public void moveUp() {y+= ySpeed;}

    public void moveDown(){ y-= ySpeed;}
    public void moveLeft(){x-= xSpeed;}
    public void moveRight(){x+= xSpeed;}
}
