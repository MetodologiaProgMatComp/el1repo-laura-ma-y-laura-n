package es.uah.matcomp.mp.e1.ejerciciosclase.p2;

public class Autores {

    AutorMod[] autores;

    private  String name;
    private double price;
    private int qty;

    public Autores(String n, AutorMod[] as, double p, int q){
        autores =as;
        price=p;
        name= n;
        qty=q;
    }

    public Autores(String name, AutorMod[] autores, double price) {
        this.autores = autores;
        this.name = name;
        this.price = price;
        qty=0;
    }

    public String getName(){return name;}

    public AutorMod getAutor(int pos) {
        return autores[pos];
    }


    public String getAutorName(int pos){
        return autores[pos].getName();
    }
    public double getPrice(){return price;}
    public int getQty(){return qty;}

    public void setPrice(double newPrice){price=newPrice;}
    public void setQty(int newQty){qty =newQty;}
    //public String toString(){return "Book [name= "+name+",autor[name= "+autor+",email= "+ autor.getEmail()+"gender= "+autor.getGender()+"],price= "+price+",qty= "+qty;}
    public String toString(){return "Book [name= "+ name + ", "+ "autores="+ autores[0]+" ,"+autores[1]+", price=" +price+",qty= "+qty+"]";}
    public String getAutorNames(){return "autores="+autores[0]+", "+autores[1];}

}


