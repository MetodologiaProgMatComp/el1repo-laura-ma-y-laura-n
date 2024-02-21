package es.uah.matcomp.mp.e1.ejerciciosclase.p2.mains;

import es.uah.matcomp.mp.e1.ejerciciosclase.Invoice;
import es.uah.matcomp.mp.e1.ejerciciosclase.Cliente;

public class MainClienteInvoice {
    public static void main(String[] args) {
        // Test Customer class
        Cliente c1 = new Cliente(88, "Tan Ah Teck", 10);
        System.out.println(c1); // Customer's toString()
        c1.setDescuento(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getNombre());
        System.out.println("discount is: " + c1.getDescuento());
        // Test Invoice class
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);
        inv1.setCantidad(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCliente()); // Customer's toString()
        System.out.println("amount is: " + inv1.getCantidad());
        System.out.println("customer's id is: " + inv1.getCustomerId());
        System.out.println("customer's name is: " + inv1.getCustomerNombre());
        System.out.println("customer's discount is: " + inv1.getDescuento());
        System.out.printf("amount after discount is: %.2f%n", inv1.getCantidadDespuesDescuento());
    
    }
}