package operaciones;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @author Robert_Rosu
 * @version 1.0.0
 */
public class Operaciones{

    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /**
     * Todos estos metodos devolveran su respectivo resultado dependiendo de los numeros y el operando introducido
     * @param valor1
     * @param valor2
     * @return numero
     * 
     */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
     * Todos estos metodos devolveran su respectivo resultado dependiendo de los numeros y el operando introducido
     * @param valor1
     * @param valor2
     * @return ret
     */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
     * Todos estos metodos devolveran su respectivo resultado dependiendo de los numeros y el operando introducido
     * @param valor1
     * @param valor2
     * @return ret
     */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
     * Todos estos metodos devolveran su respectivo resultado dependiendo de los numeros y el operando introducido
     * @param valor1
     * @param valor2
     * @return ret
     */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}