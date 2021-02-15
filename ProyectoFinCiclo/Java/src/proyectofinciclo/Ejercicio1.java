package proyectofinciclo;
import java.util.Scanner;
/**
 *
 * @author Jose Cordova 
 */
//Leer n numeros enteros, almacenados en un vector y calcularle el factorial a cada uno de los numeros leidos almacenadolos en otro vector 

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaracion de variables 
        int n, factorial = 1;
        
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();        
        
        System.out.println("Ingrese los valores del vector");
        int A[] = new int [n];
        int B[] = new int [n];
        for (int i=0; i<n; i++){
            A[i] = leer.nextInt();
            B[i] = A[i];
        }  
        System.out.println(" ");
        //Se presenta la matriz A
        for (int i = 0; i<n ; i++){
            System.out.println("A["+i+"] = " +A[i]);
        }
        
        System.out.println(" ");
        //Se calcula el factorial de los numeros ingresados
        for (int i = 0; i<n; i++){
            factorial = 1;
            for (int j = 1; j <= A[i]; j++){
                factorial = factorial * j;    
            }
        
        //Se muestra el factorial en otro vector;
        System.out.println( "B["+i+"] -> " +B[i]+ "! = "+factorial );
        }
        
        
    }
    
}
