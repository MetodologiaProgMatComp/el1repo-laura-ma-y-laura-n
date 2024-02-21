package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class LibroMod {
    private String name;
    private AutorMod autor;
    private double price;
    private int qty=0;
    private String isbn;


    public LibroMod(String  i, String n, AutorMod a, double p, int q){
        name =n;
        autor= a;
        price=p;
        isbn =i;
        qty=q;
    }



    public String getIsbn(){return isbn;}
    public String getName(){return name;}
    public AutorMod getAutor(){return autor;}
    public double getPrice(){return price;}
    public int getQty(){return qty;}

    public void setPrice(double newPrice){price=newPrice;}
    public void setQty(int newQty){qty =newQty;}
    //public String toString(){return "Book [name= "+name+",autor[name= "+autor+",email= "+ autor.getEmail()+"gender= "+autor.getGender()+"],price= "+price+",qty= "+qty;}
    public String getAutorName(){return autor.getName();}
    public String toString(){return "Book [name= "+name+ ", "+ autor.toString()+"price=" +price+",qty= "+qty+"]";}
}
