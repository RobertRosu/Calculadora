package operaciones;
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
     * 
     * @param valor1
     * @param valor2
     * @return numero
     * Todos estos metodos devolveran su respectivo resultado dependiendo de los numeros y el operando introducido
     */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}