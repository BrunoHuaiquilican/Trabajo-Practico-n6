package PracticoTemplate_Composite.punto1.punto2;

public class Spike implements ItemTrabajo{

    private String Descripcion ;
    private int tiempo ;

    public Spike(String descripcion, int tiempo){

        Descripcion = descripcion;
        this.tiempo = tiempo;
    }

    @Override
    public int calcularTimpo() {
        return tiempo;
    }
}
