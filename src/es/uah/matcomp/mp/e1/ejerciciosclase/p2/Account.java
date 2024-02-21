package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class Account {
    private int id;
    private Cliente2 cliente;
    private double balance=0;

    public Account(int id, Cliente2 cliente, double balance) {
        this.id = id;
        this.cliente = cliente;
        this.balance = balance;
    }

    public Account(int id, Cliente2 cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public Cliente2 getCliente() {
        return cliente;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return cliente + "(" + id + ")" + "balance=" + String.format("%.2f", balance);
    }

    public String getClienteNombre(){
        return cliente.getNombre();
    }

    public Account depositar(double cantidad){
        this.balance+=cantidad;
        return this;
    }

    public Account sacar(double cantidad){
        if (balance>= cantidad){this.balance-=cantidad;
        }else{ System.out.println("La cantidad que quiere extaer supera el balance");}
        return this;
    }
}
