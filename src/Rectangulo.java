public class Rectangulo extends Figura {
    private double lado1;
    private double lado2;

    public Rectangulo (double l1, double l2){
        this.lado1=l1;
        this.lado2=l2;
    }

    public double area(){
        return lado1*lado2;
    }
}
