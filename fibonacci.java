

import java.util.Scanner;
/**
 * Write a description of class fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fibonacci
{
    public static void fibonacci(){
        int N =leerEntero("indique el número de elementos");
        int pasado = 0; 
        int actual = 1;
        int temp;
        int i;
        System.out.println("los primeros "+N+" números de la serie son:");
        System.out.println(0);
        for(i=1; i<N; i++){
            
            temp = pasado+actual;
            pasado = actual;
            actual = temp;
            System.out.println(actual);
            
        }
    }
  
  public static int leerEntero(String texto){
        Scanner scanner = new Scanner(System.in);
        System.out.println(texto);
        return scanner.nextInt();
    }
}
