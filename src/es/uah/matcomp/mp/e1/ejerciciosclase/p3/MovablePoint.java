package es.uah.matcomp.mp.e1.ejerciciosclase.p3;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;


    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] result = new float[2];
        result[0] = xSpeed;
        result[1] = ySpeed;
        return result;
    }


    public MovablePoint move(){
        float x1 = getX();
        float newx =x1+xSpeed;
        float y1=getY();
        float newy = y1+ySpeed;
        MovablePoint n = new MovablePoint(newx,newy,xSpeed,ySpeed);
        return n;

    }
    @Override
    public String toString() {
//        return "MovablePoint{ Punto= ( " + getX() + ", " + getY() + "), " +
//                "Speed=" + xSpeed + ", " + ySpeed + "}";
        return "MovablePoint{" + super.toString()+ "Speed=" + xSpeed + ", " + ySpeed + "}";
    }
}//
