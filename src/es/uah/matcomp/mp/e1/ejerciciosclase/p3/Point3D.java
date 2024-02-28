package es.uah.matcomp.mp.e1.ejerciciosclase.p3;

public class Point3D extends Point2D{
    private float z=0.0f;
    Point2D punto = new Point2D(getX(),getY());

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {}

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        this.setX(x);  //ya que están privados necesitamos utilizar los getters y setters
        this.setY(y);
        this.z=z;

    }
    public float [] getXYZ(){ return new float[]{getX(),getY(),z};};

    public String toString(){return "Point3D=(x="+getX()+", y= "+getY()+", z= "+ z+")";}
}//
