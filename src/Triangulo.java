public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double a, double b){
        this.altura=a;
        this.base=b;
    }

    public double area(){
        return (base*altura)/2;
    }

}
