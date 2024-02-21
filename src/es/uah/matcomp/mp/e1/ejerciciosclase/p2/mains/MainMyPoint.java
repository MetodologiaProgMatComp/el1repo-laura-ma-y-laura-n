package es.uah.matcomp.mp.e1.ejerciciosclase.p2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.MyPoint;

public class MainMyPoint {
    public static void main(String[] args) {
        int n;
        MyPoint p1 = new MyPoint(1.2, 1.3); // Test constructor
        MyPoint another = new MyPoint(1,2);;
        System.out.println(p1); // Test toString()
        p1.setX(1); // Test setters
        p1.setY(4); //Test setters
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 4); // Test setXY()
        System.out.println(p1.getXY()[1]); // Test getXY()
        System.out.println(p1.getXY()[0]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.println(p1.Distance2(another)); // Distancia de este nuevo MyPoint al punto p1
        System.out.println(p2.Distance2(another)); // Distancia de este punto Mypoint al punto p2
        System.out.println(p1.Distance1(2, 1)); // Distancia del punto (x2,y2) a Mypoint (p1)
        System.out.println(p1.Distance3());// Distancia del punto p1 al origen

        MyPoint[] points = new MyPoint[10];

        // Inicializa los puntos (1,1), (2,2), ..., (10,10)
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        // Calcula y muestra la matriz de distancias
        System.out.println("Matriz de distancias:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                double distancia = points[j].Distance2(points[i]);
                System.out.printf("%.2f\t", distancia);
            }
            System.out.println();

    }
}}