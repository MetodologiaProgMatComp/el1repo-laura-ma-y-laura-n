package es.uah.matcomp.mp.e1.ejerciciosclase;

public class Facturas {
    private String Id;
    private String desc;
    private int qty;
    private double unitp;

    public  Facturas(String id, String d, int q, double u) {
        Id = id;
        desc = d;
        qty = q;
        unitp = u;
    }
    public String getId(){return Id;}
    public String getDesc(){return desc;}
    public int getQty(){ return qty;}
    public void setQty(int newQty){this.qty = newQty;}
    public double getUnitp(){return unitp;}

    public void setUnitp(double newUnitp){
        this.unitp = newUnitp;
    }

    public double getTotal(){ return unitp*qty;}
    public String toString(){ return "InvoiceItem[ id= "+ Id + ", desc= " + desc+", qry= "+ qty+", unitPrice= "+unitp+"]";}

} //h