package composite2.tetsPractico;

import PracticoTemplate_Composite.punto1.EmpleadoComposite;
import PracticoTemplate_Composite.punto1.EmpleadoRegular;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class empleadosPunto1 {
    @Test
    public void test01() {
        EmpleadoRegular empleado1 = new EmpleadoRegular("Juan", 1000);


        EmpleadoComposite lider = new EmpleadoComposite("Lider A", "Líder", 2000);
        lider.agregarSubordinado(empleado1);


        EmpleadoComposite mando = new EmpleadoComposite("Mando B", "Mando medio", 3000);
        mando.agregarSubordinado(lider);


        EmpleadoComposite gerente = new EmpleadoComposite("Gerente C", "Gerente", 4000);
        gerente.agregarSubordinado(mando);


        EmpleadoComposite director = new EmpleadoComposite("Director D", "Director", 5000);
        director.agregarSubordinado(gerente);

        double total = director.calcularSueldo();
        //Esperado: 5000 + 4000 + 3000 + 2000 + 1000 = 15000
        double esperado = 15000;
        assertEquals(esperado, total);
    }

    @Test
    public void test02() {
        EmpleadoRegular empleado1 = new EmpleadoRegular("Ana", 1000);
        EmpleadoRegular empleado2 = new EmpleadoRegular("Luis", 1100);


        EmpleadoComposite lider1 = new EmpleadoComposite("Lider1", "Líder", 2000);
        lider1.agregarSubordinado(empleado1);

        EmpleadoComposite lider2 = new EmpleadoComposite("Lider2", "Líder", 2100);
        lider2.agregarSubordinado(empleado2);


        EmpleadoComposite mando1 = new EmpleadoComposite("Mando1", "Mando medio", 3000);
        mando1.agregarSubordinado(lider1);

        EmpleadoComposite mando2 = new EmpleadoComposite("Mando2", "Mando medio", 3100);
        mando2.agregarSubordinado(lider2);


        EmpleadoComposite gerente1 = new EmpleadoComposite("Gerente1", "Gerente", 4000);
        gerente1.agregarSubordinado(mando1);

        EmpleadoComposite gerente2 = new EmpleadoComposite("Gerente2", "Gerente", 4200);
        gerente2.agregarSubordinado(mando2);


        EmpleadoComposite director1 = new EmpleadoComposite("Director1", "Director", 5000);
        director1.agregarSubordinado(gerente1);

        EmpleadoComposite director2 = new EmpleadoComposite("Director2", "Director", 5500);
        director2.agregarSubordinado(gerente2);

        double total = director1.calcularSueldo() + director2.calcularSueldo();

        double resultado = 31000;
        assertEquals(resultado , total);

    }
}
