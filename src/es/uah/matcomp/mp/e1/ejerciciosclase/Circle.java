package es.uah.matcomp.mp.e1.ejerciciosclase;


    public class Circle {  //Variables privadas no accesibles desde fuera de la clase
        private double radio;
        private String color;

        public Circle() {  //Constructor por defecto,variables inmutables
            radio = 1.2;
            color = "Azul";
        }

        public Circle(double r) {  //Constructor, radio mutable (elegido por el usuario) y color por defecto
            this.radio = r;
            color = "Azul";
        }

        public Circle(double r, String c) {  //Constructor, radio mutable (elegido por el usuario) y color por defecto
            radio = r;
            color = c;
        }

        public double getRadio() {
            return radio;
        }  //Metodos publicos para acceder desde TestCircle

        public double getArea() {
            return radio * radio * Math.PI;
        }

        public String getColor() {
            return color;
        } //implementamos la función getColor para poder imprimirlo por pantalla
        public void setRadio(double newRadio){
            this.radio = newRadio;
        }
        public void setColor(String newColor){
            color = newColor;
        }
        public String toString(){
            return "Circle[radio= "+ radio + ", color= " +color+ "]";
        }

    }
//h
