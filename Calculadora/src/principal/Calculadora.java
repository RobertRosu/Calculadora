package principal;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import menu.Menu;
import operaciones.Operaciones;
import formatter.HTMLFormatter;

/**
 * @author Robert_Rosu
 * @version 1.0.0
 * Esta clase se encarga de mostrar por pantalla los resultados posibles, dependiendo de los numeros y el operando introducidos
 */

public class Calculadora{
	private static final Logger LOGGER = Logger.getLogger("operaciones.log");
	
    public static void main(String[] args) throws IOException{ 
    	
    	LOGGER.setLevel(Level.ALL);
    	LOGGER.setUseParentHandlers(false);
    	
    	Handler consoleHandler = new ConsoleHandler();
    	Handler fileHandler = null;
    	consoleHandler.setLevel(Level.WARNING);
    	
    	LOGGER.addHandler(consoleHandler);
    	
    		try {
    		fileHandler = new FileHandler("C:\\Users\\rober\\git\\Calculadora\\Calculadora\\logs\\resultadosCalculadora.html", true);
    		LOGGER.addHandler(fileHandler);
    		fileHandler.setLevel(Level.ALL);
    		fileHandler.setFormatter(new HTMLFormatter());
    		} catch (IOException exception) {
    		LOGGER.log(Level.SEVERE, "Error al cargar la configuración",exception);
    		}
    	
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{
            operandos = menu.pedirNumeros();
            operacion = menu.menuOpciones();
            
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                LOGGER.log(Level.FINE, operacion + "," + operandos[0] + "," + operandos[1] + "," + resultado);
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                LOGGER.log(Level.FINE, operacion + "," + operandos[0] + "," + operandos[1] + "," + resultado);
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                LOGGER.log(Level.FINE, operacion + "," + operandos[0] + "," + operandos[1] + "," + resultado);
            } else if (operacion.equalsIgnoreCase("/")){
                try {
                	resultado = operaciones.dividir(operandos[0], operandos[1]);
                	LOGGER.log(Level.FINE, operacion + "," + operandos[0] + "," + operandos[1] + "," + resultado);
                }catch(ArithmeticException e) {
                	LOGGER.log(Level.WARNING, "No se puede dividir entre 0");
                	resultado = 0;
                }
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                LOGGER.log(Level.FINE, operacion + "," + operandos[0] + "," + operandos[1] + "," + resultado);
            } else {
                System.out.println ("Operacion no valida");
            }
        }   while (menu.repetir());
    }
}