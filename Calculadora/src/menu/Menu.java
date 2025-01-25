package menu;
import java.util.Scanner;

/**
* Clase que gestiona la interaccion con el usuario en una calculadora.
*
* @author Gorka Kortabitarte
* @version 21.01.2025
*/

public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    
    /**
     * Funcion para pedirle 2 numeros al usuario
     * @return ret: array con 2 numeros
     */
    
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**
     * Funcion para pedirle al usuario que operacion quiere hacer
     * @return ret: devuelve la operacion realizada
     */
    
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    /**
     * Funcion para preguntar si quiere volver a usar la calculadora o no
     * @return ret: devuelve un boolean
     */
    
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("�Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}