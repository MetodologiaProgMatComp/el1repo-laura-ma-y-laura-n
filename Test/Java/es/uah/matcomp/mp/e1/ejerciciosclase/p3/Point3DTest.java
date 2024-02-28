package es.uah.matcomp.mp.e1.ejerciciosclase.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point2D p2D = new Point2D(2.3f,4.5f);
        Point3D p3D = new Point3D(p2D.getX(), p2D.getY(), 1.2f);
        float pz=p3D.getZ();
        assertEquals(1.2f, pz);
    }

    @Test
    void setZ() {
        Point2D p2D = new Point2D(2.3f,4.5f);
        Point3D p3D = new Point3D(p2D.getX(), p2D.getY(), 1.2f);
        assertDoesNotThrow(()-> p3D.setZ(9.2f));
        float pz=p3D.getZ();
        assertEquals(9.2f, pz);
    }

    @Test
    void setXYZ() {
        Point3D p3D = new Point3D(2.3f,4.5f, 1.2f);
        assertDoesNotThrow(()-> p3D.setXYZ(9.2f,7.6f,3.4f));
        float[] xyz=p3D.getXYZ();
        assertEquals(9.2f, xyz[0]);
        assertEquals(7.6f, xyz[1]);
        assertEquals(3.4f, xyz[2]);
    }

    @Test
    void getXYZ() {
        Point3D p3D = new Point3D(2.3f,4.5f, 1.2f);
        float[] xyz=p3D.getXYZ();
        assertEquals(2.3f, xyz[0]);
        assertEquals(4.5f, xyz[1]);
        assertEquals(1.2f, xyz[2]);
    }

    @Test
    void testToString() {
        Point3D p3D = new Point3D();
        assertEquals("Point3D=(x=0.0, y= 0.0, z= 0.0)", p3D.toString());
    }
}