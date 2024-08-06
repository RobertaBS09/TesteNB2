
package entidades;
/* @author roberta.bsilva17*/
public class Trapezio {
    public double baseMaior;
    public double baseMenor;
    public double altura;
    
    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public Trapezio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
           public double area(){
                   return (baseMaior = baseMenor) * altura / 2.00;
           }
}
