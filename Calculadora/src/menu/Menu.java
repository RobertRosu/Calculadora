package menu;

/**
 * @author Robert_Rosu
 * @version 1.0.0
 * Pide por teclado dos numeros y un operando, luego devuelve el resultado y 
 * pregunta si quieres repetir
 */
import java.util.Scanner;
public class Menu {
	
    private static Scanner teclado = new Scanner(System.in);
    
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    /**
     * 
     * @return ret
     * Metodo que se encarga de pedir el operando
     * Devuelve el operando introducido
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
    * 
    * @return ret
    * Metodo que pregunta si quieres repetir, mediante un booleano
    */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("Deseas contiunar trabajando con la calculadora? [s/n]: ");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}