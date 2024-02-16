package es.uah.matcomp.mp.e1.ejerciciosclase;

public class Account {
    private String id;
    private String nombre;
    private int balance=0;



    public Account(String Id, String nom){
        id=Id;
        nombre=nom;
        balance=0;
    }
    public Account(String Id, String nom, int bal){
        id=Id;
        nombre=nom;
        balance=bal;
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

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int cantidad){
        int balancenew = this.balance + cantidad;
        setBalance(balancenew);
        return balance;
    }
    public int debit(int cantidad) {
        int bal= getBalance();
        if (cantidad < bal) {
            int balancenew = bal - cantidad;
            setBalance(balancenew);
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

}
