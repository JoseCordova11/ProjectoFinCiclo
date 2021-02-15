package proyectofinciclo;
import java.util.Scanner;
/**
 *
 * @author Jose Cordova 
 */

/** Escriba un algoritmo que indique si dos vectores de enteros son “circularmente iguales”, 
 *  que significa tener los mismos elementos y en el mismo orden relativo circularmente.
    Entrada: A = [1, 2, 3, 4], B = [3, 4, 1, 2].
    Salida: Los dos vectores SI son circularmente iguales.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion de variables
        int n = 4;
        System.out.println("Algoritmo que indique si 2 vectores son Circularmente iguales");
                
        //Se crea el vector A
        System.out.println("Vector A ");
        int A[] = new int [n]; 
        for (int i = 0; i<n ; i++){
            A[i] = leer.nextInt();
            
        }
        System.out.println(" ");
        
        //Se crea el vector B
        System.out.println("Vector B ");
        int B[] = new int [n]; 
        for (int i = 0; i<n ; i++){
            B[i] = leer.nextInt();
            
        }
        System.out.println(" ");
        
        //Se verifica si son circularmente iguales
        if ((A[0]==B[2]) && (A[1]==B[3]) && (A[2]==B[0]) && (A[3]==B[1])){
            System.out.println("Son circularmente iguales");
        }
        else{
            System.out.println("No son circularmente iguales");
        }
        
        
    }
    
}
