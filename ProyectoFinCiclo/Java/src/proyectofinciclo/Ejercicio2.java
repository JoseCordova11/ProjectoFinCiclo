package proyectofinciclo;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
//Leer dos matrices de 5x5 enteras y determinar si el promedio entero de los numeros primos de una matriz se encuentra almacenado en la otra matriz 

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n = 5, d = 0, cp1 = 0, cp2 = 0;
        int pro1 = 0, pro2 = 0, suma1 = 0, suma2 = 0;
                
        //Se crean las matrices
        int A[][] = new int [n][n];
        int B[][] = new int [n][n];
        
        System.out.println("Ingrese los elementos de la primera matriz");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println(" ");
        
        System.out.println("Ingrese los elementos de la segunda matriz");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                B[i][j] = leer.nextInt();
            }
        }
        System.out.println(" ");
        
        //Se verifican los numeros primos
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                d = 2;
                
                while ((A[i][j] % d != 0)&&(A[i][j] > d))
                        d = d +1;
                
                if (A[i][j]<= d){
                    suma1 = suma1 + A[i][j];
                    cp1++;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                d = 2;
                
                while ((B[i][j] % d != 0)&&(B[i][j] > d))
                    d = d +1;
                
                if (B[i][j]<= d){
                    suma2 = suma2 + B[i][j];
                    cp2++;
                }
            }
        }
        System.out.println(" ");    
        
        //Se presenta las matrices
        System.out.println("La Primera matriz es: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        System.out.println("La Segunda matriz es: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        //Se calcula el promedio
        pro1 = suma1 / cp1;
        pro2 = suma2 / cp2;
        
        System.out.println("el promedio de la primera matriz es: "+pro1);
        System.out.println("El promedio de la segunda matriz es: "+pro2);
        
        if (pro1 == pro2){
            System.out.println("Sus promedios son iguales");
        }
        else{
            System.out.println("No son promedios iguales");
        }
    }
}