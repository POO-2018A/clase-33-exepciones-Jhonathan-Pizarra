
package excepciones2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        try{
        System.out.println("\t\t\t ¡Bienvenido!");
        System.out.println("Vamos a hacer una división...");
        
        System.out.print("Ingresa el numerador: ");
        int numerador = entrada.nextInt();
        System.out.print("Ingresa el denominaor: ");
        int denominador = entrada.nextInt();
        
        
        int divison = cociente(numerador, denominador);
        
        System.out.println("Dividir: "+numerador+"/"+denominador+ " da como resultado "+divison);
        }catch(ArithmeticException ex1){
        
            String mensaje = ex1.getMessage();
            System.out.println("Error, tu tratas de "+mensaje);
        
        }catch(InputMismatchException ex2){
        
            String mensaje = ex2.getMessage();
            System.out.println("Error, no es un numero entero");
        }catch(Exception ex3){
        
            String mensaje =ex3.getMessage();
            System.out.println("Estás comentiendo un error de/en/por: "+mensaje+ ".");
        
        }finally{
        
                System.out.println("Manjeo de Exepciones exitosa.");
        
        }
        
    }

    private static int cociente(int numerador, int denominador) {
        
        int respuesta = (numerador/denominador);
    
        return respuesta;
    }
    
}
