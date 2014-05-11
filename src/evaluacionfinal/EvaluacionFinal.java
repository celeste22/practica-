/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionfinal;
import java.util.*;
/**
 *
 * @author chikuchis
 */
public class EvaluacionFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ing=new Scanner(System.in);
        int n ;
        boolean b=true;
      //  try{
       // while(b){
        System.out.println("Ingrese la cantidad de enteros que desea guardar:");
        n=ing.nextInt();
       // }
        coleccionEnteros Col=new coleccionEnteros(n);
        Col.menu();
    }
    //}catch(InputMismatchException){}
}
