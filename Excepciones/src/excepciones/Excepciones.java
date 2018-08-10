package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        try{
        System.out.println("\t\t\t ¡Benvenido!");
        System.out.print("¿Cuántos items tendrá tu arreglo?: ");
        int cantidad = entrada.nextInt();
        
        int arreglo[] = new int[cantidad];
        
        for(int i=0; i<cantidad; i++){
        
            System.out.print("Ingrese el item ["+(i)+"]: ");
            arreglo[i] = entrada.nextInt();
        
        }
        System.out.println("");
        System.out.print("¿Qué item [?] quieres ver?: ");
        int verItem = entrada.nextInt();
    
        System.out.print("Item en la posición ["+(verItem)+"] es: "+arreglo[verItem] );
        
        System.out.println("");
        System.out.println("RESPUESTAS: ");
        for(int i=0; i<cantidad; i++){
        
        System.out.print("Item["+(i)+"] = "+arreglo[i]+" ");
        
        
        }
        
        }catch(InputMismatchException ex1){ 
          
            //String mensaje =ex1.getMessage();
            System.out.println("No ingresaste un numero entero");
            
        }catch(ArrayIndexOutOfBoundsException ex2){
        
            String mensaje =ex2.getMessage();
            System.out.println("Tu arreglo no tiene "+mensaje+ " items.");
        
        }catch(Exception ex3){
        
            String mensaje =ex3.getMessage();
            System.out.println("Estás comentiendo un error de/en/por: "+mensaje+ ".");
        
        }finally{
        
                System.out.println("Manjeo de Exepciones exitosa.");
        
        }
        
     
        
    }
    
}
