import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
/**
 * Write a description of class Parejas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pareja
{
    // instance variables - replace the example below with your own
    private ArrayList<String> alumnos;

    /**
     * Constructor for objects of class Parejas
     */
    public Pareja()
    {
        alumnos = new ArrayList<>();
        alumnos.add("Adeva Tranche, Adrián");
        alumnos.add("Aller González, Francisco Javier");
        alumnos.add("Álvarez Prieto, Noelia");
        alumnos.add("Barrionuevo Pérez, Manuel");
        alumnos.add("Bóveda del Río, José Antonio");
        alumnos.add("de la Viuda Crespo, Ignacio");
        alumnos.add("Encina Maestro, David");
        alumnos.add("Felix Nañez, Kevin");
        alumnos.add("Fernández Diez, Daniel");
        alumnos.add("Fernández González, Javier");
        alumnos.add("Fernández Rincón, Jesús");
        alumnos.add("Fuentes Álvarez, Francisco José");
        alumnos.add("García Juárez, David");
        alumnos.add("García Serrano, Rubén");
        alumnos.add("González Álvarez, David");
        alumnos.add("López Beltrán, Víctor");
        alumnos.add("Lora García, Sandra");
        alumnos.add("Melcón Diez, Víctor");
        alumnos.add("Menéndez Pouso, Francisco José");
        alumnos.add("Pérez Bayón, Álvaro");
        alumnos.add("Pradera San José, Daniel");
        alumnos.add("Prieto Mediavilla, Gabriel");
        alumnos.add("Robles González, Miguel Ángel");
        alumnos.add("Sánchez Manzano, Adán");
        alumnos.add("Serrano García, Verónica");
        alumnos.add("Tascón González, Anibal");
        alumnos.add("Tascón2 González, Anibal");
    }

    /**
     * Este método nos da formato al número
     */
    public String formatoNumero(int numero) 
    {
        String formato = "" + numero;
        if (numero < 10) {
            formato = "000" + numero;
        }
        else if (numero < 100) {
            formato = "00" + numero;
        }
        else if (numero < 1000) {
            formato = "0" + numero;
        }
        return formato;
    }

    /**
     * Metodo para mostrar los alumnos por parejas
     */
    public void mostraPareja() 
    {
        ArrayList<String> copia = new ArrayList<>();
        copia = (ArrayList)alumnos.clone();
        Collections.shuffle(copia);
        int numero = 1;
        int contador = 0;
        Iterator<String> it = copia.iterator();
        String nombre = "";
        while (it.hasNext()) {
            nombre = it.next();
            it.remove();
            if (contador == 0) {
                System.out.println("");
                System.out.println("Esta es la pareja número:" + formatoNumero(numero) );
                System.out.println("");
                numero++;
            }
            System.out.println(nombre);
            contador++;
            if (contador == 2 && copia.size() > 1) {
                contador = 0;
            }
        }
    }
}