
package appareatrapezioconstrutor;

import entidades.Trapezio;

/*@author roberta.bsilva17*/
public class AppAreaTrapezioConstrutor {
    public static void main(String[] args) {
    double baseMaior = 10;
    double baseMenor = 7.5;
    double altura = 6.3;
   
    Trapezio x = new Trapezio(baseMaior,baseMenor,altura);
    System.out.printf("�rea X = %.2f%n", x.area());
     System.out.printf("Obrigada!", x.area());
    }
    
}
