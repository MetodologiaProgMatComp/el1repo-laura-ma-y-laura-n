import es.uah.matcomp.mp.e1.ejerciciosclase.Facturas;

public class MainFacturas {
        public static void main(String[] args) {
            // Test constructor and toString()
            Facturas inv1 = new Facturas("A101", "Pen Red", 888, 0.08);
            System.out.println(inv1); // toString();
            // Test Setters and Getters
            inv1.setQty(999);
            inv1.setUnitp(0.99);
            System.out.println(inv1); // toString();
            System.out.println("id is: " + inv1.getId());
            System.out.println("desc is: " + inv1.getDesc());
            System.out.println("qty is: " + inv1.getQty());
            System.out.println("unitPrice is: " + inv1.getUnitp());
            // Test getTotal()
            System.out.println("The total is: " + inv1.getTotal());
        } //h
    }


