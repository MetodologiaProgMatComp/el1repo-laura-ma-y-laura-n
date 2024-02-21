package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class Libro {
    private String name;
    private Autor autor;
    private double price;
    private int qty=0;

    public Libro(String n,Autor a,double p){
        name =n;
        autor= a;
        price=p;
    }
    public Libro(String n,Autor a,double p,int q){
        name =n;
        autor= a;
        price=p;
        qty=q;
    }
    public String getName(){return name;}
    public Autor getAutor(){return autor;}
    public double getPrice(){return price;}
    public int getQty(){return qty;}

    public void setPrice(double newPrice){price=newPrice;}
    public void setQty(int newQty){qty =newQty;}
    //public String toString(){return "Book [name= "+name+",autor[name= "+autor+",email= "+ autor.getEmail()+"gender= "+autor.getGender()+"],price= "+price+",qty= "+qty;}
    public String toString(){return "Book [name= "+name+ ", "+ autor.toString()+"price=" +price+",qty= "+qty;}
    public String getAutorName(){return autor.getName();}
    public String getAutorEmail(){return autor.getEmail();}
}
