package es.uah.matcomp.mp.e1.ejerciciosclase;

public class Account {
    private String id;
    private String nombre;
    private int balance=0;



    public Account(String id, String nombre){
        this.id=id;
        this.nombre=nombre;
        this.balance=0;
    }
    public Account(String id, String nombre, int balance){
        this.id=id;
        this.nombre=nombre;
        this.balance=balance;
    }

    public Account() {
        this.id=id;
        this.nombre=nombre;
        this.balance=0;
    }

    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getBalance(){
        return balance;
    }

    public int credit(int cantidad){
        balance=balance +cantidad;
        return balance;
    }
    public int debit(int cantidad) {
        if (cantidad <= balance) {
            balance = balance - cantidad;
        } else {
            System.out.println("La cantidad excede al balance");
        }
        return balance;
    }
    public int transferenciaA(Account otra, int cantidad){
        if (cantidad <= balance) {
            balance = balance - cantidad;
            otra.balance = otra.balance + cantidad;
        } else {
            System.out.println("La cantidad excede al balance");
        }
        return balance;
    }
    public String toString(){
        return "Account[id= "+id +", nombre= "+ nombre +", balance= "+ balance+"]";
    }

    public Object credit() {
        return null;
    }
}
