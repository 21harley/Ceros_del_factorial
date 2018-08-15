/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceros_factorial;
import java.io.*;
/**
 *
 * @author CASA
 */
public class Ceros_Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int numero=0,re=0,cot=0,rr=0;
        DataInputStream lector =new DataInputStream(System.in);
        do{
            try{
                System.out.println("Ingre se el numero de la factorial");
                numero=Integer.parseInt(lector.readLine());
            }catch(NumberFormatException ex){
                System.out.println("Ingreso mal los datos ");re=3;
            }
             if(re!=3){
            do{
               if(numero>=5){
                cot++;
               numero-=5;
               }else{
                   numero=0;
               }
           }while(numero>0);
            System.out.println("La cantidad de 0 de la factorial es "+cot);
            cot=0;
            do{
                try{
                    System.out.println("Desea continuar en el prograrma=0\n"
                    +"Desea salir del programa=1");rr=0;
                    re=Integer.parseInt(lector.readLine());
                }catch(NumberFormatException ex){
                 System.out.println("Ingreso mal los datos vuelva a intentar");
                 rr=1;
                }
                if(rr!=1){
                    if(re!=0&&re!=1){
                        System.out.println("Respuesta no valida");rr=1;
                    }
                }
            }while(rr!=0);   
              }
        }while(re==0);
       
    }
    
}
