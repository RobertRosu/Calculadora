package principal;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import formatter.HTMLFormatter;
import menu.Menu;
import operaciones.Operaciones;

/**
 * @author Robert_Rosu
 * @version 1.0.0
 * Esta clase se encarga de mostrar por pantalla los resultados posibles, dependiendo de los numeros y el operando introducidos
 */

public class Calculadora{
	private static final Logger LOGGER = Logger.getLogger("Logger operaciones");
	
    public static void main(String[] args) throws IOException{ 
    	
    	LOGGER.setLevel(Level.ALL);
    	LOGGER.setUseParentHandlers(false);
    	
    	Handler consoleHandler = new ConsoleHandler();
    	Handler fileHandler = null;
    	consoleHandler.setLevel(Level.WARNING);
    	
    	LOGGER.addHandler(consoleHandler);
    	
    		try {
    		fileHandler = new FileHandler("C:/Users/1AW3-18/git/CalculadoraLogging/Calculadora/logs/resultadosCalculadora.html", true);
    		LOGGER.addHandler(fileHandler);
    		fileHandler.setLevel(Level.ALL);
    		} catch (IOException exception) {
    		LOGGER.log(Level.SEVERE, "Error al cargar la configuración",exception);
    		}
    	
        int resultado = 0;
        String operacion = "";
        int[] operandos = new int [2];
        
        Menu menu = new Menu();
        Operaciones operaciones = new Operaciones();
        
        do{ 
            if (operacion.equalsIgnoreCase("+")){
                resultado = operaciones.sumar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                LOGGER.log(Level.FINE, "Se ha hecho una suma + : " + operandos[0] + " " + operandos[1] + " " +  resultado);
            } else if (operacion.equalsIgnoreCase("-")){
                resultado = operaciones.restar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                LOGGER.log(Level.FINE, "Se ha hecho una resta - : " + operandos[0] + " " + operandos[1] + " " +  resultado);
            } else if (operacion.equalsIgnoreCase("*")){
                resultado = operaciones.multiplicar(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                LOGGER.log(Level.FINE, "Se ha hecho una multiplicacion * : " + operandos[0] + " " + operandos[1] + " " +  resultado);
            } else if (operacion.equalsIgnoreCase("/")){
                try {
                	resultado = operaciones.dividir(operandos[0], operandos[1]);
                	LOGGER.log(Level.FINE, "Se ha hecho una division / : " + operandos[0] + " " + operandos[1] + " " +  resultado);
                }catch(ArithmeticException e) {
                	LOGGER.log(Level.WARNING, "No se puede dividir entre 0");
                	resultado = 0;
                }
                System.out.println ("Resultado: " + resultado);
            } else if (operacion.equalsIgnoreCase("%")){
                resultado = operaciones.resto(operandos[0], operandos[1]);
                System.out.println ("Resultado: " + resultado);
                LOGGER.log(Level.FINE, "Se ha hecho un resto % : " + operandos[0] + " " + operandos[1] + " " +  resultado);
            } else {
                System.out.println ("Operacion no valida");
            }
        }   while (menu.repetir());
    }
}