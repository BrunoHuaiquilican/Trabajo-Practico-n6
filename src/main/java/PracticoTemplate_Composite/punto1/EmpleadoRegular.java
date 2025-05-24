package PracticoTemplate_Composite.punto1;

public class EmpleadoRegular implements Empleado {
    private String nombre ;
    private double sueldo;


    public  EmpleadoRegular(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo ;
    }
    @Override
    public double calcularSueldo() {
        return sueldo;
    }
}
