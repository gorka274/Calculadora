package operaciones;

/**
* Clase Operaciones
*
* @author Gorka Kortabitarte
* @version 21.01.2025
*/


public class Operaciones{
	
	/** 
	 * Suma el valor1 y el valor2
	 * @param valor1 el primer valor introducido
	 * @param valor2 el segundo valor introducido
	 * @return devuelve la suma de valor1 y valor2
	 */
	
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    /**
     * Resta el valor1 y el valor2
     * @param valor1 el primer valor introducido
     * @param valor2 el segundo valor introducido
     * @return devuelve la resta de valor1 y valor2
     */
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
     * Multiplica el valor1 y el valor2
     * @param valor1 el primer valor introducido
     * @param valor2 el segundo valor introducido
     * @return devuelve la multiplicacion de valor1 y valor2
     */
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
     * Divide el valor1 y el valor2
     * @param valor1 el primer valor introducido
     * @param valor2 el segundo valor introducido
     * @return devuelve la division de valor1 y valor2
     */
    
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
     * Calcula el resto del valor1 y el valor2
     * @param valor1 el primer valor introducido
     * @param valor2 el segundo valor introducido
     * @return devuelve el resto de valor1 y valor2
     */
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}