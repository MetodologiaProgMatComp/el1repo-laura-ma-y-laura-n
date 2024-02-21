package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class Invoice {
    private int id;
    private Cliente cliente;
    private double cantidad;

    public Invoice(int id, Cliente cliente, double cantidad) {
        this.id = id;
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getCustomerId(){
        return cliente.getId();
    }

    public String getCustomerNombre(){
        return cliente.getNombre();
    }

    public int getDescuento(){
        return cliente.getDescuento();
    }

    public double getCantidadDespuesDescuento(){
        double cantidad=getCantidad() - getCantidad()*cliente.getDescuento()/100;
        setCantidad(cantidad);
        return getCantidad();
    }

    @Override
    public String toString() {
        return "Invoice[id="+ id +", cliente=" + cliente +", cantidad=" + cantidad +"]";
    }
}
