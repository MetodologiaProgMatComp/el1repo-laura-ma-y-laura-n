package es.uah.matcomp.mp.e1.ejerciciosclase.p2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.p2.Cliente2;
import es.uah.matcomp.mp.e1.ejerciciosclase.p2.Account;

public class MainCliente2Account {
    public static void main(String[] args) {
        // Test Customer class
        Cliente2 c1= new Cliente2(1452, "Pedrito", 'm');
        System.out.println(c1); // Customer's toString()
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getNombre());
        System.out.println("gender is: " + c1.getGender());
        // Test Account class
        Account ac1 = new Account(88, c1);
        System.out.println(ac1);
        ac1.setBalance(4000);
        System.out.println(ac1);
        System.out.println("id is: " + c1.getId());
        System.out.println("customer is: " + ac1.getCliente()); // Customer's toString()
        System.out.println("balance is: " + ac1.getBalance());
        System.out.println("customer's id is: " + ac1.getId());
        System.out.println("customer's name is: " + ac1.getClienteNombre());
        ac1.depositar(1000);
        System.out.println("balance after deposit is: " + ac1.getBalance());
        ac1.sacar(2000);
        System.out.println("balance after sacar is: " + ac1.getBalance());
        ac1.sacar(8000);
        System.out.println("balance after sacar mucho is: " + ac1.getBalance());

    }
}
