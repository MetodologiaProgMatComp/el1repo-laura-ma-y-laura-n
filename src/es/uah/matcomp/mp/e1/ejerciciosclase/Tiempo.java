package es.uah.matcomp.mp.e1.ejerciciosclase;

public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo(int hora, int minutos, int segundos){
        this.hora= hora;
        this.minutos= minutos;
        this.segundos= segundos;
    }
    public int getHora(){
        return hora;
    }
    public int getMinutos(){
        return minutos;
    }
    public int getSegundos(){
        return segundos;
    }
    public void setHora(int hora){
        this.hora=hora;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public void setTiempo(int hora, int minutos, int segundos){
        this.hora=hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d",hora,minutos,segundos);
    }
    public Tiempo nextSegundo(){
        segundos++;
        if (segundos>=60){
            segundos=0;
            ++minutos;
            if (minutos>=60){
                minutos=0;
                ++hora;
                if (hora>=24){
                    hora=0;
                }
            }
        }
        return this;
    }
    public Tiempo anteriorSegundo(){
        --segundos;
        if (segundos<0){
            segundos=59;
            --minutos;
            if (minutos<0){
                minutos=59;
                --hora;
                if (hora<0){
                    hora=23;
                }
            }
        }
        return this;
    }

}
