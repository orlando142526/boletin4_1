
package boletin4_1;
import java.util.Scanner;
public class Boletin4_1 {


    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in); 
      coche coche = new coche();
      int v;
      System.out.println("Cuanto ha acelerado");
      v=sc.nextInt();
      coche.acelerar(v);
      System.out.println("Cuanto ha frenado");
      v=sc.nextInt();
      coche.frenar(v);
System.out.println(coche.getVelocidade());
        
        
    }
    
}
