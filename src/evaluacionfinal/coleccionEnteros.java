/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionfinal;
import java.util.Scanner;
/**
 *
 * @author Celeste Villagran
 */
public class coleccionEnteros {
    private vector V;
    private Scanner ing;

    public coleccionEnteros(int n) {
        V =new vector(n);
        ing=new Scanner(System.in);
    }
    public void menu(){
        int op='S',opcion;
        
        while (op=='S'){
        System.out.println("\033[31mMENU DE OPCIONES");
        System.out.println("*************************");
        System.out.println("1- Cargar Coleccion");
        System.out.println("2- Desplegar Coleccion");
        System.out.println("3- Buscar un valor");
        System.out.println("4- Buscar el Maximo");
        System.out.println("5- Desplegar posiciones Multiplos");
        System.out.println("6- Promedio de valores");
        System.out.println("7- Invertir Coleccion");
        System.out.println("8- Duplicar celdas multiplos");
        System.out.println("9- Verificar si existen repetidos");
        System.out.println("0-SALIR");
            System.out.println("\033[31mElija una opcion:");
            opcion=ing.nextInt();
         switch (opcion){
             case 1: cargarColeccion();
                 break;
             case 2: desplegarColeccion();
                 break;
             case 3: buscarValor();
                 break;
             case 4: maximoValor();
                 break;
             case 5: multiplo();
                 break;
             case 6: promedioValores();
                 break;
             case 7: invertir();
                 break;
             case 8: duplicar();
                 break;
             case 9: hayRepetidos();
                 break;
             case 0: op='N';
                 System.out.println("\033[35mbye bye!!!");
                 break;
             default: System.out.println("\033[31mOpcion incorrecta...");
                 
         }
           
        }
    
    }
    public void cargarColeccion(){
        
        int num;
        for(int i=0;i<V.getDim();i++){
            num=(int)(Math.random()*50+1);
            V.setElem(num, i);
        }
        System.out.println("Carga realizada con exito");
    }
    public void buscarValor(){
        
        int N;
        boolean b;
        System.out.println("Ingrese el numero que desea buscar en la coleccion:");
        N=ing.nextInt();
        b=existeValor(N);
        if(b){
            System.out.println("El valor ingresado SI existe en la coleccion");
        }
        else{
            System.out.println("El valor ingresado NO existe en la coleccion");
        }
        
   }
    public boolean existeValor(int N){
    boolean b = false;
        for(int i=0;i<V.getDim();i++){
            if(V.getElem(i)==N){
            b=true;
            break;
            }
            else{
            b=false;
            } 
        }
        return b;
    }
    public void desplegarColeccion(){
        System.out.println("Los valores son:");
        for(int i=0;i<V.getDim();i++){
           System.out.print(" "+V.getElem(i)); 
        }
     System.out.println();
    }
    
    public void maximoValor (){
        int max=V.getElem(0);
        for(int i=1;i<V.getDim();i++){
          if(V.getElem(i)>max){
          max=V.getElem(i);
          }
    }
        System.out.println("El maximo valor encontrado es:"+max);
    }
    public void multiplo(){
        System.out.println("Ingrese la posicion multiplo");
        desplegarPosicionesMultiplo (ing.nextInt());
    }
    
   public void  desplegarPosicionesMultiplo (int num){
       int i=0;
       System.out.println("Los valores de las posiciones multiplos del numero "+num+" son: ");
   while( i< V.getDim()){
   if(i%num==0){
       System.out.print(" "+V.getElem(i));
   }
   i++;
   }
       System.out.println();
   }
   public void promedioValores(){
       int sum=0;
    for(int i=0;i<V.getDim();i++){
       sum=sum+V.getElem(i);
   }
       System.out.println("El promedio es:"+sum/V.getDim());
   }
   public void invertir(){
       int i,j,aux;
       i=0;
       j=V.getDim()-1;
       int medio=V.getDim()/2;
       while(i<medio &&j>=medio){
           aux=V.getElem(i);
           V.setElem(V.getElem(j), i);
           V.setElem(aux, j);
           i++;
           j--;
       }
       System.out.println("La coleccion invertida es:");
   desplegarColeccion();
   }
   public void duplicar(){
       System.out.println("Ingrese un numero para buscar sus multiplos y duplicarlos:");
       duplicarCeldasMultiplo(ing.nextInt());
       //duplicarCeldasMultiplo1(ing.nextInt());
   }
   public void duplicarCeldasMultiplo1(int valor){
       for(int i=0;i<V.getDim();i++){
           if(i%valor==0){
           V.setElem(V.getElem(i)*2, i);
           }
       }
      System.out.println("La nueva coleccion es:");
      desplegarColeccion(); 
   }
   
   public void duplicarCeldasMultiplo(int valor){
       boolean b=false;
       System.out.println("Los valores modificados por ser multiplos de "+valor+" son");
       for(int i=0;i<V.getDim();i++){
           if(V.getElem(i)%valor==0){
               V.setElem(V.getElem(i)*2,i);
               System.out.print(" "+V.getElem(i));
               b=true;
           }
       }
       System.out.println();
       if(!b){
       System.out.println("\033[31mNo se encontro ningun multiplo del numero ingresado");
       
       }
}
   
   public void hayRepetidos(){
       boolean b=false;
       for(int i=0;i<V.getDim()-1;i++){
           for(int j=i+1;j<V.getDim();j++){
             if(V.getElem(i)==V.getElem(j)){
                 b=true;
                 break;
             }
           }
       }
       if(b){
           System.out.println("La coleccion de enteros SI posee repetidos");
       }
       else {
           System.out.println("La coleccion de enteros No posee repetidos");
       }
   }
}
