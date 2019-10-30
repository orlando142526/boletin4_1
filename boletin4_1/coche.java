
package boletin4_1;


public class coche {
    private int velocidade;
 private int acelerar;
 private int frenar;
 public coche(){
     velocidade=0;
 }
public int getVelocidade(){
    int kmh = velocidade;
    return kmh;
     
 }
 public void acelerar(int valor){
     velocidade = velocidade + valor;
     
 }
public void frenar(int menos){
velocidade = velocidade - menos;
    
}
}

