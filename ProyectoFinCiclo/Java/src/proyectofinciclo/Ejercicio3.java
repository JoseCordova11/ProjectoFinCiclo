package proyectofinciclo;
import java.util.Scanner;
/**
 *
 * @author Jose Cordova
 */
//Construir una funcion que reciba como parametro un entero y retome ese elemento de la serie de Fibonacci.

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Declaracion de variables
        int num = 0;
        
        System.out.println("Ingrese la posicion que desea mostrar de la serie fibonacci");
        num = leer.nextInt();
        System.out.println(fibonacci(num));
    }
    
    //Se cre la funcion
    public static int fibonacci(int n){
        if (n>1){
            return fibonacci(n-1) + fibonacci(n-2); 
        }
        else if (n==1) { 
            return 1;
        }
        else if (n==0){ 
            return 0;
        }
        else{ 
            System.out.println("Debes ingresar una posicion mayor o igual a 1");
            return -1; 
        }
    }

}   
        
            
        
            
        
        
        
        
    

        
        