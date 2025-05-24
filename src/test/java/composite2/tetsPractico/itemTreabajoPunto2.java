package composite2.tetsPractico;


import PracticoTemplate_Composite.punto1.punto2.HistoriaUsuario;
import PracticoTemplate_Composite.punto1.punto2.Proyecto;
import PracticoTemplate_Composite.punto1.punto2.Spike;
import PracticoTemplate_Composite.punto1.punto2.Tarea;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class itemTreabajoPunto2 {

    @Test
    public void test01() {
        var historia1 = new HistoriaUsuario("historia 1 ");
        var splick1 = new Spike("splike 01" , 2);
        var tarea = new Tarea("tarea01", 5);
        var proyecto1 = new Proyecto("procecto 1 ");

        historia1.agregatItems(tarea);
        historia1.agregatItems(splick1);
        proyecto1.agredarItems(historia1);

        int esperado = 7 ;

        assertEquals(esperado , proyecto1.calcularTimpo());

     }
     @Test
    public void test02() {

        var historia1 = new HistoriaUsuario("historia 1 ");

        var splick1 = new Spike("splike 01" , 2);
        var splick2 = new Spike("splike 02" , 8);
        var splick3 = new Spike("splike 03" , 5);

        var tarea = new Tarea("tarea01", 5);
        var tarea1 = new Tarea("tarea02", 5);

        var proyecto1 = new Proyecto("procecto 1 ");


        historia1.agregatItems(tarea);
        historia1.agregatItems(tarea1);

        historia1.agregatItems(splick1);
        historia1.agregatItems(splick2);

        historia1.agregatItems(splick3);
        proyecto1.agredarItems(historia1);

        int esperado = 25 ;

        assertEquals(esperado , proyecto1.calcularTimpo());

    }
}
